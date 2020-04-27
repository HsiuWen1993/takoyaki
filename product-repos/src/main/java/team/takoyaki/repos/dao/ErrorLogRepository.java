package team.takoyaki.repos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import team.takoyaki.repos.po.ErrorLogEntity;

public interface ErrorLogRepository extends JpaRepository<ErrorLogEntity, Long>  {

}