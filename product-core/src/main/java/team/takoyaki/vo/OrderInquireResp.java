package team.takoyaki.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class OrderInquireResp extends ErrorResp{
	
	private Long orderUid;
	
	private Long memberUid;
	
	private BigDecimal total;
	
	private Integer amount;
	
	private Timestamp orderTime;
	
	private Character status;
}
