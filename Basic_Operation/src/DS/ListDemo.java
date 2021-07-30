package DS;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add("Hello");
		list.add(20);
		list.add("Marlabs");
		// find object of given type in a heterogeneous List
		/*for (Object obj : list) {
			if (obj instanceof Integer) {
				System.out.println(obj);
			}
		}*/
		check(list,Integer.class);
	}
	public static void check(List<?> list, Class<Integer> clazz) {
		for (Object o : list) {
		    if (o instanceof Integer) {
		     System.out.println(o);
		    }
		  }
		 // return null;
	}
}
