package team.takoyaki.service;

import team.takoyaki.vo.ApplyMemberReq;
import team.takoyaki.vo.ApplyMemberResp;
import team.takoyaki.vo.MemberInfoModifyReq;
import team.takoyaki.vo.MemberInfoModifyResp;

public interface MemberService {

	public ApplyMemberResp apply(ApplyMemberReq req);

	public MemberInfoModifyResp infoModify(MemberInfoModifyReq req);
	
}
