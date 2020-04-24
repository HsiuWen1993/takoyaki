package team.takoyaki.repos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import team.takoyaki.repos.po.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>  {

}
