package DS;

import java.util.Scanner;

public class ClassLoader1 {
	 public static void main(String[] args) 
	    { 
	        // String class is loaded by bootstrap loader, and 
	        // bootstrap loader is not Java object, hence null 
	        System.out.println(Scanner.class.getClassLoader()); 
	  
	        // Test class is loaded by Application loader 
	        System.out.println(Test.class.getClassLoader()); 
	        StringBuffer s=new StringBuffer("a");
	        System.out.println("s before appending  :"+s);
	        s.append("b");
	       System.out.println("s after appending  :"+s);   
	    } 
}
