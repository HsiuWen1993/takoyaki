package com.takoyaki.product.service;

import com.takoyaki.product.vo.ApplyMemberReq;
import com.takoyaki.product.vo.ApplyMemberResp;
import com.takoyaki.product.vo.MemberInfoModifyReq;
import com.takoyaki.product.vo.MemberInfoModifyResp;

public interface MemberService {

	public ApplyMemberResp apply(ApplyMemberReq req);

	public MemberInfoModifyResp infoModify(MemberInfoModifyReq req);
}
