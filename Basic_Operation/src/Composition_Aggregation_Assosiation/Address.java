package Composition_Aggregation_Assosiation;

public class Address {
	private int id;
	private String country;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String country, String city) {
		super();
		this.id = id;
		this.country = country;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	

}
