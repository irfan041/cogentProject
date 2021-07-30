package DS;

public class InheritenceDemo {

	public static void main(String[] args) {
		C c1 = new C();

	}
}

class A {
	static {
		System.out.println("A Block");
	}
	{
		System.out.println("A IIB");
	}

	A() {
		System.out.println("A Constructor");
	}
}

class B extends A {
	static {
		System.out.println("B Block");
	}
	{
		System.out.println("B IIB");
	}

	B() {
		System.out.println("B Constructor");
	}
}

class C extends B {
	static {
		System.out.println("C Block");
	}
	{
		System.out.println("C IIB");
	}

	C() {
		System.out.println("C Constructor");
	}
}
