package team.takoyaki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import team.takoyaki.service.OrderService;
import team.takoyaki.vo.OrderAddReq;
import team.takoyaki.vo.OrderAddResp;
import team.takoyaki.vo.OrderInquireReq;
import team.takoyaki.vo.OrderInquireResp;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping(path = "/add")
	public OrderAddResp orderAdd(@RequestBody OrderAddReq req) {
		return orderService.OrderAdd(req);
	}
	
	@PostMapping(path ="/inquire")
	public OrderInquireResp orderInquire(OrderInquireReq req) {
		return orderService.OrderInquire(req);
	}
	
}
