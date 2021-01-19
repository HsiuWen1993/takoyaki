package team.takoyaki.repos.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
	private BigDecimal total;
	
	@Column(name = "AMOUNT")
	@NotNull
	private Integer amount;
	
	@Column(name = "ORDER_TIME")
	@NotNull
	private Timestamp orderTime;
	
	@Column(name = "STATUS")
	@NotNull
	private Character status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderUid() {
		return orderUid;
	}

	public void setOrderUid(Long orderUid) {
		this.orderUid = orderUid;
	}

	public Long getMemberUid() {
		return memberUid;
	}

	public void setMemberUid(Long memberUid) {
		this.memberUid = memberUid;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Timestamp getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
