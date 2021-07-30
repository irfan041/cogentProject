public class Test1 {
	public static void main(String[] args) {
		System.out.println(7);
		test1();

	}
static void test1() {
		System.out.println(1);
		test2();
		System.out.println(2);
	}

	static void test2() {
		System.out.println(3);
		test3();
		System.out.println(4);
	}

	static void test3() {
		System.out.println(5);
		try {
			Class.forName("arg0");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(6);
	}
}
