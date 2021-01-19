package team.takoyaki.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderAddReq {
	@JsonProperty(value = "ORDER_UID")
	private Long orderUid;

	@JsonProperty(value = "MEMBER_UID")
	private Long memberUid;

	@JsonProperty(value = "TOTAL")
	private BigDecimal total;

	@JsonProperty(value = "AMOUNT")
	private Integer amount;

	@JsonProperty(value = "ORDER_TIME")
	private Timestamp orderTime;

	@JsonProperty(value = "STATUS")
	private Character status;

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

}
