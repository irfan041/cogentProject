package Composition_Aggregation_Assosiation;

public class Emp { // has a relation ship, aggregation
	
	private int id;
	private String name;
	private Address address;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
