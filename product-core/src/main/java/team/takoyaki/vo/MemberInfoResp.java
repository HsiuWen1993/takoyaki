package team.takoyaki.vo;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MemberInfoResp extends ErrorResp{

	private String name;

	private String nickname;

	private String mobilePhone;

	private String telephone;

	private String email;

	private String memberLevel;

	private String memberType;

	private Timestamp joinDatetime;

	private Timestamp updateDatetime;

	private String country;

	private String city;

	private String district;

	private String township;

	private String village;

	private String neighborhood;

	private String street;

	private String road;

	private String section;

	private String lane;

	private String alley;

	private String number;

	private Integer floor;
}
