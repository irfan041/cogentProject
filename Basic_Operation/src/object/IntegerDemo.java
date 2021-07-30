package object;

public class IntegerDemo {
	public static void main(String[] args) {
		Integer s1 = new Integer(100);
		Integer s2 = new Integer(200);
		IntegerDemo d=new IntegerDemo();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(d.hashCode());

	}
}
