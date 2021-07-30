package Composition_Aggregation_Assosiation;

public class Test {

	public static void main(String[] args) {

		Emp e = new Emp();
		
		
		Invoice invoice=new Invoice();
		String pname=invoice.getProduct().getName();
		String city=invoice.getAddress().getCity();
		String ename=invoice.getEmp().getName();
		

	}

}
