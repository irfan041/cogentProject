package Composition_Aggregation_Assosiation;

public class Invoice {// part-of//composition
	
	private Emp emp;
	private Address address;
	private Product product;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(Emp emp, Address address, Product product) {
		super();
		this.emp = emp;
		this.address = address;
		this.product = product;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	

}
