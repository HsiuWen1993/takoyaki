package team.takoyaki.repos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import team.takoyaki.repos.po.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
