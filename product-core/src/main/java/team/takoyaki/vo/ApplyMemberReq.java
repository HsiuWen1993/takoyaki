package team.takoyaki.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ApplyMemberReq {
	@JsonProperty(value = "NAME")
	private String name;

	@JsonProperty(value = "NICKNAME")
	private String nickname;

	@JsonProperty(value = "MOBILE_PHONE")
	private String mobilePhone;

	@JsonProperty(value = "TELEPHONE")
	private String telephone;

	@JsonProperty(value = "EMAIL")
	private String email;

	@JsonProperty(value = "PASSWORD")
	private String password;

	@JsonProperty(value = "COUNTRY")
	private String country;

	@JsonProperty(value = "CITY")
	private String city;

	@JsonProperty(value = "DISTRICT")
	private String district;

	@JsonProperty(value = "TOWNSHIP")
	private String township;

	@JsonProperty(value = "VILLAGE")
	private String village;

	@JsonProperty(value = "NEIGHBORHOOD")
	private String neighborhood;

	@JsonProperty(value = "STREET")
	private String street;

	@JsonProperty(value = "ROAD")
	private String road;

	@JsonProperty(value = "SECTION")
	private String section;

	@JsonProperty(value = "LANE")
	private String lane;

	@JsonProperty(value = "ALLEY")
	private String alley;

	@JsonProperty(value = "NUMBER")
	private String number;

	@JsonProperty(value = "FLOOR")
	private Integer floor;
}
