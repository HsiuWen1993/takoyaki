package team.takoyaki.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.takoyaki.repos.dao.OrderRepository;
import team.takoyaki.repos.po.OrderEntity;
import team.takoyaki.vo.OrderAddReq;
import team.takoyaki.vo.OrderAddResp;
import team.takoyaki.vo.OrderInquireReq;
import team.takoyaki.vo.OrderInquireResp;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repository;

	@Override
	public OrderAddResp orderAdd(OrderAddReq req) {
		repository.save(setOrderEntity(req));
		OrderAddResp orderAddResp = new OrderAddResp();
		orderAddResp.setSuccess(true);
		return orderAddResp;
		
	}

	@Override
	public OrderInquireResp orderInquire(OrderInquireReq req) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * OrderAddReq轉OrderEntity
	 * 
	 * @param req
	 * @return
	 */
	
	private OrderEntity setOrderEntity(OrderAddReq req) {
		OrderEntity orderEntity = new OrderEntity();
		
		orderEntity.setOrderUid(req.getOrderUid());
		orderEntity.setMemberUid(req.getMemberUid());
		orderEntity.setTotal(req.getTotal());
		orderEntity.setAmount(req.getAmount());
		orderEntity.setOrderTime(Timestamp.valueOf(LocalDateTime.now()));
		orderEntity.setStatus('0');
		return orderEntity;
	}	
	
}
