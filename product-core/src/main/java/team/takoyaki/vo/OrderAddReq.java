package team.takoyaki.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderAddReq {
	@JsonProperty(value="ORDER_UID")
	private Long orderUid;
	
	@JsonProperty(value="MEMBER_UID")
	private Long memberUid;
	
	@JsonProperty(value="TOTAL")
	private BigDecimal total;
	
	@JsonProperty(value="AMOUNT")
	private Integer amount;
	
	@JsonProperty(value="ORDER_TIME")
	private Timestamp orderTime;
	
	@JsonProperty(value="STATUS")
	private Character status;
}
