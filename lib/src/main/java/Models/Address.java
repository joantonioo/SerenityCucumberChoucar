package Models;

public class Address {
	String company;
	String address;
	String house;
	String city;
	String state;
	String postal;
	String country;
	String info;

	public Address(String company, String address, String house, String city, String state, String postal,
			String country, String info) {
		super();
		this.company = company;
		this.address = address;
		this.house = house;
		this.city = city;
		this.state = state;
		this.postal = postal;
		this.country = country;
		this.info = info;
	}

	public String getCompany() {
		return company;
	}

	public String getAddress() {
		return address;
	}

	public String getHouse() {
		return house;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPostal() {
		return postal;
	}

	public String getCountry() {
		return country;
	}

	public String getInfo() {
		return info;
	}

}
