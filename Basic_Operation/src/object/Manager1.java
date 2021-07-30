package object;

import java.lang.reflect.Method;

public class Manager1 {

	public static void main(String[] args) {
		Class c1=Object.class;
		Method all[]=c1.getDeclaredMethods();
		for(Method m:all){

		System.out.println(m.getName());
		}
	}

}
