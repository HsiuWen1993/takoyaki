package team.takoyaki.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import team.takoyaki.repos.dao.MemberRepository;
import team.takoyaki.repos.po.MemberEntity;
import team.takoyaki.vo.ApplyMemberReq;
import team.takoyaki.vo.ApplyMemberResp;
import team.takoyaki.vo.MemberInfoModifyReq;
import team.takoyaki.vo.MemberInfoModifyResp;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository repository;
	@Autowired
	private Gson gson;
	
	@Override
	public ApplyMemberResp apply(ApplyMemberReq req) {
		String name =req.getName();
		MemberEntity memberEntity = new MemberEntity();
		memberEntity.setName(name);
		System.out.println("name:"+name);
		repository.save(memberEntity);
		return null;
	}
	
	@Override
	public MemberInfoModifyResp infoModify(MemberInfoModifyReq req) {
		// TODO Auto-generated method stub
		return null;
	}

}
