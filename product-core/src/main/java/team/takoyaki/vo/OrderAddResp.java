package team.takoyaki.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderAddResp {
	
	@JsonProperty(value ="success")
	private Boolean success;
}
