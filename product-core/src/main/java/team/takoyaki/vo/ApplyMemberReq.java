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

}
