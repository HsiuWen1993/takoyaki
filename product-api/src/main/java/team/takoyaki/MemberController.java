package team.takoyaki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import team.takoyaki.service.MemberService;
import team.takoyaki.vo.ApplyMemberReq;
import team.takoyaki.vo.ApplyMemberResp;
import team.takoyaki.vo.MemberInfoModifyReq;
import team.takoyaki.vo.MemberInfoModifyResp;

//@Api(tags = "Member")
@RestController
@RequestMapping(value = "/member")
public class MemberController {
	@Autowired
	private MemberService memberService;

	// @ApiOperation(value = "申請會員", notes = "申請會員")
	@PostMapping(path = "/apply")
	public ApplyMemberResp applyMember(// @ApiParam(required = true, value = "會員資料")
			@RequestBody ApplyMemberReq req) {
		return memberService.apply(req);
	}

	@PostMapping(path = "/infoModify")
	public MemberInfoModifyResp infoModify(MemberInfoModifyReq req) {
		return memberService.infoModify(req);
	}
}
