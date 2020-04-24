package team.takoyaki.repos.po;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Table(name = "TAKOYAKI_ORDER")
@Data
public class OrderEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ORDER_UID")
	@NotNull
	private Long orderUid;
	
	@Column(name = "MEMBER_UID")
	@NotNull
	private Long memberUid;
	
	@Column(name = "TOTAL")
	@NotNull
	private Integer total;
	
	@Column(name = "AMOUNT")
	@NotNull
	private Integer amount;
	
	@Column(name = "ORDER_TIME")
	@NotNull
	private Timestamp orderTime;
	
	@Column(name = "STATUS")
	@NotNull
	private Character status;
}
