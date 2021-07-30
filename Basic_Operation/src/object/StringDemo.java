package object;

public class StringDemo {

	public static void main(String[] args) {
		String str=new String("abc");
		String str1=new String("abc");
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
   BufferDemo();
   WrapperDemo();
	}
	static void BufferDemo(){
		StringBuffer sb=new StringBuffer("abc");
		StringBuffer sb1=new StringBuffer("abc");
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
		StringBuilder sd=new StringBuilder("abc");
		StringBuilder sd1=new StringBuilder("abc");
		System.out.println(sd==sd1);
		System.out.println(sd.equals(sd1));
	}
	static void WrapperDemo(){
		Integer sb=new Integer(100);
		Integer sb1=new Integer(100);
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
		
	}

}
