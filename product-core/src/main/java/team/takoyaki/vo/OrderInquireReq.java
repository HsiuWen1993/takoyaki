package team.takoyaki.vo;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class OrderInquireReq {

	private Long orderUid;
	
	private Long memberUid;
	
	private Timestamp orderTime;
}
