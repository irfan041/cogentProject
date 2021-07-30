package Stringexmp;

public class InhDemo {
	public static void main(String[] args) {
		A b1 = new B();
		b1.display();
	}
}

class A {
	int x = 10;

	/*
	 * A(int x) { this.x = x; }
	 */

	void display() {
		System.out.println(x);
	}
}

class B extends A {
	B() {

		System.out.println(" B Constructor");
	}

	void dispay() {
		System.out.println("B Dispay");
	}
}