package team.takoyaki.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import team.takoyaki.product.po.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
