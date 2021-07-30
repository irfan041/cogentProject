package thread;

public class Manager {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		B b1 = new B(a2);
		C c1 = new C(a2);
		b1.start();
		c1.start();
	}
}

class A {
	synchronized void test1() {
		System.out.println("test1 begin");
		try {
			wait();
		} catch (InterruptedException e) {

		}
		System.out.println("test1 end");
	}

	synchronized void test2() {
		System.out.println("test2 begin");
		notify();
		System.out.println("test2 end");
	}
}

class B extends Thread {
	A a1 = null;

	B(A a1) {
		this.a1 = a1;
	}

	public void run() {
		a1.test1();
	}
}

class C extends Thread {
	A a1 = null;

	C(A a1) {
		this.a1 = a1;
	}

	public void run() {
		try {
			sleep(1000);
			a1.test2();
		} catch (InterruptedException e) {
		}

	}
}
