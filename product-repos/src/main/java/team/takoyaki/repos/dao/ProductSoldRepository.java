package team.takoyaki.repos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import team.takoyaki.repos.po.ProductSoldEntity;

public interface ProductSoldRepository extends JpaRepository<ProductSoldEntity,Long> {

}
