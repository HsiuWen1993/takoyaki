package team.takoyaki.service;

import team.takoyaki.vo.ApplyMemberReq;
import team.takoyaki.vo.ApplyMemberResp;
import team.takoyaki.vo.MemberInfoModifyReq;
import team.takoyaki.vo.MemberInfoModifyResp;
import team.takoyaki.vo.MemberInfoResp;

public interface MemberService {
	/**
	 * 申請會員
	 * 
	 * @param req
	 * @return
	 */
	public ApplyMemberResp apply(ApplyMemberReq req);

	/**
	 * 修改會員資料
	 * 
	 * @param req
	 * @return
	 */
	public MemberInfoModifyResp infoModify(MemberInfoModifyReq req);

	/**
	 * 取得會員資料
	 * 
	 * @param memberUid
	 * @return
	 */
	public MemberInfoResp getMemberInfo(String memberUid);
}
