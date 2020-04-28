package team.takoyaki.service;

import team.takoyaki.vo.OrderAddReq;
import team.takoyaki.vo.OrderAddResp;
import team.takoyaki.vo.OrderInquireReq;
import team.takoyaki.vo.OrderInquireResp;

public interface OrderService {
	
	/**
	 * 新增訂單
	 * 
	 * @param req
	 * @return
	 */
	public OrderAddResp OrderAdd(OrderAddReq req);
	
	/**
	 * 查詢訂單
	 * 
	 * @param req
	 * @return
	 */
	public OrderInquireResp OrderInquire(OrderInquireReq req);
	
	
}
