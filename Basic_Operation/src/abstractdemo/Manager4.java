package abstractdemo;

public class Manager4 {

	public static void main(String[] args) {
		D d1 = new D() {
			public void test1() {
				System.out.println(1);
			}

			public void test2() {
				System.out.println(2);
			}
		};
		d1.test1();
		d1.test2();

	}

}

interface D {
	void test1();

	void test2();
}
