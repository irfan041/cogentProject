package abstractdemo;

abstract class F {
	abstract void test();
}
public class Manager {
	static F method1() {
		F f1 = new F() {
			void test() {
				System.out.println(1);
			}
		};
		return f1;
	}
static F method2() {
		return new F() {
			void test() {
				System.out.println(2);
			}

		};	}
public static void main(String[] args) {
		F f1 = method1();
		F f2 = method2();
		f1.test();
		f2.test();

	}

}
