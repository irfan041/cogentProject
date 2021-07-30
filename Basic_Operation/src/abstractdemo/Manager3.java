package abstractdemo;

public class Manager3 {

	public static void main(String[] args) {
		G g1 = new G(10) {
		};
		g1.test();
		G g2 = new G(10) {
			void test() {
				System.out.println(3);
			}
		};
		g2.test();

	}
}

class G {
	G(int x) {
		System.out.println(1);
	}

	void test() {
		System.out.println(2);
	}
}
