package DS;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		TreeMap m=new TreeMap(new MyComparator());
		m.put(new Emp1(10,"irfan"), "irfan");
		m.put(new Emp1(9,"irfan"), "Behera");
		System.out.println(m);
		

	}

}
class Emp1{
	int id;
	String name;
	Emp1(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return  "{key="+id+","+name+"},value";
	}
	 @Override
	public int hashCode(){
		return name.hashCode()+id;
	}
	 public boolean equals(Object obj){
		 Emp1 emp=(Emp1)obj;
		 return this.name==emp.name && this.id==emp.id;
	 }
	
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Emp1 str=(Emp1)o1;
		Emp1 str1=(Emp1)o2;

   if(str.id>str1.id){
	 return 1;
    }
   else if(str.id<str1.id)
    return -1;
   else 
	   return 0;
	}
	
}