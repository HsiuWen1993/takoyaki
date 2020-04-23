package team.takoyaki.repos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import team.takoyaki.repos.po.MemberLoginInfoEntity;

public interface MemberLoginInfoRepository extends JpaRepository<MemberLoginInfoEntity, Long> {

}

