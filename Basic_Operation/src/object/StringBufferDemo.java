package object;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("abc");
		StringBuffer s2=new StringBuffer("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
