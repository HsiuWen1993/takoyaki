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

	public Long getMemberUid() {
		return memberUid;
	}

	public void setMemberUid(Long memberUid) {
		this.memberUid = memberUid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public Timestamp getJoinDatetime() {
		return joinDatetime;
	}

	public void setJoinDatetime(Timestamp joinDatetime) {
		this.joinDatetime = joinDatetime;
	}

	public Timestamp getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(Timestamp updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTownship() {
		return township;
	}

	public void setTownship(String township) {
		this.township = township;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public String getAlley() {
		return alley;
	}

	public void setAlley(String alley) {
		this.alley = alley;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
