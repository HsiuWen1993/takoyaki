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
@Table(name = "TAKOYAKI_MEMBER")
@Data
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MEMBER_UID")
	private Long memberUid;

	@Column(name = "NAME")
	@NotNull
	private String name;

	@Column(name = "NICKNAME")
	private String nickname;

	@Column(name = "MOBILE_PHONE")
	@NotNull
	private String mobilePhone;

	@Column(name = "TELEPHONE")
	private String telephone;

	@Column(name = "EMAIL")
	@Pattern(regexp = "^\\w{1,63}@[a-zA-Z0-9]{2,63}\\.[a-zA-Z]{2,63}(\\.[a-zA-Z]{2,63})?$")
	@NotNull
	private String email;

	@Column(name = "PASSWORD")
	@NotNull
	private String password;

	@Column(name = "MEMBER_LEVEL")
	@NotNull
	private String memberLevel;

	@Column(name = "MEMBER_TYPE")
	@NotNull
	private String memberType;

	@Column(name = "JOIN_DATETIME")
	@NotNull
	private Timestamp joinDatetime;

	@Column(name = "UPDATE_DATETIME")
	@NotNull
	private Timestamp updateDatetime;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "CITY")
	private String city;

	@Column(name = "DISTRICT")
	private String district;

	@Column(name = "TOWNSHIP")
	private String township;

	@Column(name = "VILLAGE")
	private String village;

	@Column(name = "NEIGHBORHOOD")
	private String neighborhood;

	@Column(name = "STREET")
	private String street;

	@Column(name = "ROAD")
	private String road;

	@Column(name = "SECTION")
	private String section;

	@Column(name = "LANE")
	private String lane;

	@Column(name = "ALLEY")
	private String alley;

	@Column(name = "NUMBER")
	private String number;

	@Column(name = "FLOOR")
	private Integer floor;

}
