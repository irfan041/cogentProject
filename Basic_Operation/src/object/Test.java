package object;

class A12 {

	protected int x = 20;

}

class B extends A12 {
	protected int y = 10;
}

class C extends B {
	//y=100;
	void test() {
		System.out.println(x);
	}

}
public class Test {

	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
	}

}
