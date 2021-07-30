public class Test3 {

	public static void main(String[] args) {
		test1();
		System.out.println("Finish");
	}

	static void test1() {
		try {
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		} catch (ArithmeticException e) {
			System.out.println(3);
			test2();
		}
	}

	static void test2() {
		try {
			String str = null;
			System.out.println(4);
			System.out.println(str.length());
			System.out.println(5);
		} catch (NullPointerException e) {
			test3();
			System.out.println(6);
		}
	}

	static void test3() {
		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(7);
			System.out.println(arr[6]);
			System.out.println(5);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(8);
		}
	}
}
