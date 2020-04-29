package team.takoyaki.repos.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import team.takoyaki.repos.po.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>  {

	@Query(value = "select ORDER_UID, AMOUNT, TOTAL, STATUS from TAKOYAKI_ORDER where ORDER_UID =?")
	OrderEntity findByOrderUid(Long OrderUid);
	
	//@Query("select MEMBER_UID, AMOUNT, TOTAL, STATUS from TAKOYAKI_ORDER where MEMBER_UID =?1, nativeQuery = true")
	//List<OrderEntity> findByMemberUid(Long MemberUid);
	
	//@Query("select ORDER_TIME, AMOUNT, TOTAL, STATUS from TAKOYAKI_ORDER where ORDER_TIME between =?1 and =?2")
	//List<OrderEntity> findByOrderTime(Timestamp date1,Timestamp date2);
}
