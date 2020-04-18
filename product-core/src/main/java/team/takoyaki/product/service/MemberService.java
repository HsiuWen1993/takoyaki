package team.takoyaki.product.service;

import team.takoyaki.product.vo.ApplyMemberReq;
import team.takoyaki.product.vo.ApplyMemberResp;
import team.takoyaki.product.vo.MemberInfoModifyReq;
import team.takoyaki.product.vo.MemberInfoModifyResp;

public interface MemberService {

	public ApplyMemberResp apply(ApplyMemberReq req);

	public MemberInfoModifyResp infoModify(MemberInfoModifyReq req);
	
}
