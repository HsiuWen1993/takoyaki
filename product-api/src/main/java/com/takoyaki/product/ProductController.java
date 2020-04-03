package com.takoyaki.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takoyaki.product.service.MemberService;
import com.takoyaki.product.vo.ApplyMemberReq;
import com.takoyaki.product.vo.ApplyMemberResp;
import com.takoyaki.product.vo.MemberInfoModifyReq;
import com.takoyaki.product.vo.MemberInfoModifyResp;

@RestController
@RequestMapping(value = "/takoyaki")
public class ProductController {
	@Autowired
	private MemberService memberService;

	@PostMapping(path = "/applyMember")
	public ApplyMemberResp applyMember(ApplyMemberReq req) {
		return memberService.apply(req);
	}

	@PostMapping(path = "/infoModify")
	public MemberInfoModifyResp infoModify(MemberInfoModifyReq req) {
		return memberService.infoModify(req);
	}
}
