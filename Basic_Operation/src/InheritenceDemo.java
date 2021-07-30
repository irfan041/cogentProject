public class InheritenceDemo {

	public static void main(String[] args) {
		C1 c1 = new C1();
}
	}

class A1 extends Object{
	
	{
		System.out.println("A IIB");
	}

	A1() {
		super();
		//IIB Calling Stattemt
		System.out.println("A Constructor");
	}
}

class B1 extends A1 {
	static {
		System.out.println("B Block");
	}
	{
		System.out.println("B IIB");
	}

	B1() {
		super();
		System.out.println("B Constructor");
	}
}

class C1 extends B1 {
	static {
		System.out.println("C Block");
	}
	{
		System.out.println("C IIB");
	}

	C1() {
		super();
		System.out.println("C Constructor");
	}
}
