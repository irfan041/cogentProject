package collection;

import java.util.TreeMap;

public class TestEmployee {

	public static void main(String[] args) {
		TreeMap<Employee,Integer> tm=new TreeMap<Employee, Integer>(new EmployeeAddress());
		tm.put(new Employee(101, "Vincent", "New York"), null);
		tm.put(new Employee(102, "Irfan", "UK"), null);
		System.out.println(tm);

	}

}
