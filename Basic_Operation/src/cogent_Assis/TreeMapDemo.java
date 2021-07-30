package cogent_Assis;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Employee, Integer> m=new TreeMap<Employee, Integer>(new NameComparator());
		//Map<Employee, Integer> m=new TreeMap<Employee, Integer>(new AddressComparator());
		m.put(new Employee(1,"Allen","UK",2345678), 1);
		m.put(new Employee(2,"Black","USA",89745678), 2);
		m.put(new Employee(3,"James","New Jesrsy",234567834), 4);
		m.put(new Employee(4,"Daniel","India",234567889), 5);
		
		System.out.println(m);
		

	}

}
