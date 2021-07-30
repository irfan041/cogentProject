package cogent_Assis;

public class Employee {
	private int id;
	private String name;
	private String address;
	private int contNo;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String address, int contNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contNo = contNo;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContNo() {
		return contNo;
	}
	public void setContNo(int contNo) {
		this.contNo = contNo;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", contNo=" + contNo + "]";
	}
	

}
