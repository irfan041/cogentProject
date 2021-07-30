package abstractdemo;

class J {
	int x;

	J(int x) {
		System.out.println(1);
	}

	{
		System.out.println(2);
	}

	void test1() {
		System.out.println(3);
	}
}

public class Manager1 {
	public static void main(String[] args) {
		J j1 = new J(10) {
			{
				System.out.println(4);

			}

			void test1() {
				System.out.println(x);
			}
		};
		j1.test1();
	}

}
