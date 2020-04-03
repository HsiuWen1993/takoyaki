package com.takoyaki.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.takoyaki.product.dto.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
