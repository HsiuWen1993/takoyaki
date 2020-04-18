package team.takoyaki.repos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import team.takoyaki.repos.po.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
