package team.takoyaki.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.takoyaki.repos.dao.MemberRepository;
import team.takoyaki.repos.po.MemberEntity;
import team.takoyaki.vo.ApplyMemberReq;
import team.takoyaki.vo.ApplyMemberResp;
import team.takoyaki.vo.MemberInfoModifyReq;
import team.takoyaki.vo.MemberInfoModifyResp;
import team.takoyaki.vo.MemberInfoResp;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository repository;

	@Override
	public ApplyMemberResp apply(ApplyMemberReq req) {
		repository.save(setMemberEntity(req));
		ApplyMemberResp applyMemberResp = new ApplyMemberResp();
		applyMemberResp.setSuccess(true);
		return applyMemberResp;
	}

	@Override
	public MemberInfoModifyResp infoModify(MemberInfoModifyReq req) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberInfoResp getMemberInfo(String memberUid) {
		MemberEntity memberEntity = null;
		try {
			memberEntity = repository.findById(Long.valueOf(memberUid))
					.orElseThrow(() -> new Exception("查無" + memberUid + "的資訊."));
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}

		return setMemberInfoResp(memberEntity);
	}

	/**
	 * ApplyMemberReq轉MemberEntity
	 * 
	 * @param req
	 * @return
	 */
	private MemberEntity setMemberEntity(ApplyMemberReq req) {
		MemberEntity memberEntity = new MemberEntity();
		// 必要
		memberEntity.setName(req.getName());
		memberEntity.setNickname(req.getNickname());
		memberEntity.setMobilePhone(req.getMobilePhone());
		memberEntity.setTelephone(req.getTelephone());
		memberEntity.setEmail(req.getEmail());
		memberEntity.setPassword(req.getPassword());
		memberEntity.setMemberLevel("LEVEL_1");
		memberEntity.setMemberType("NATURAL");
		memberEntity.setJoinDatetime(Timestamp.valueOf(LocalDateTime.now()));
		memberEntity.setUpdateDatetime(Timestamp.valueOf(LocalDateTime.now()));
		// 國籍
		memberEntity.setCountry(req.getCountry());
		// 地址
		memberEntity.setCity(req.getCity());
		memberEntity.setDistrict(req.getDistrict());
		memberEntity.setTownship(req.getTownship());
		memberEntity.setVillage(req.getVillage());
		memberEntity.setNeighborhood(req.getNeighborhood());
		memberEntity.setStreet(req.getStreet());
		memberEntity.setRoad(req.getRoad());
		memberEntity.setSection(req.getSection());
		memberEntity.setLane(req.getLane());
		memberEntity.setAlley(req.getAlley());
		memberEntity.setNumber(req.getNumber());
		memberEntity.setFloor(req.getFloor());
		return memberEntity;
	}

	/**
	 * MemberEntity轉MemberInfoResp
	 * 
	 * @param memberEntity
	 * @return
	 */
	private MemberInfoResp setMemberInfoResp(MemberEntity memberEntity) {
		MemberInfoResp memberInfoResp = new MemberInfoResp();
		// TODO
		memberInfoResp.setName(memberEntity.getName());
		return memberInfoResp;
	}
}
