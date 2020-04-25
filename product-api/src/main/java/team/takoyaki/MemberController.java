package team.takoyaki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import team.takoyaki.service.MemberService;
import team.takoyaki.vo.ApplyMemberReq;
import team.takoyaki.vo.ApplyMemberResp;
import team.takoyaki.vo.MemberInfoModifyReq;
import team.takoyaki.vo.MemberInfoModifyResp;
import team.takoyaki.vo.MemberInfoResp;

@RestController
@RequestMapping(value = "/member")
public class MemberController {
	@Autowired
	private MemberService memberService;

	@PostMapping(path = "/apply")
	public ApplyMemberResp applyMember(@RequestBody ApplyMemberReq req) {
		return memberService.apply(req);
	}

	@PostMapping(path = "/infoModify")
	public MemberInfoModifyResp infoModify(MemberInfoModifyReq req) {
		return memberService.infoModify(req);
	}

	@GetMapping(path = "/info")
	public MemberInfoResp getMemberInfo(@RequestParam String memberUid) {
		return memberService.getMemberInfo(memberUid);
	}
}
