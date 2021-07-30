package DS;
class Demo1 {
	Demo1() {
		System.out.println("A Const");
	}
}

class B12 extends Demo1 {

	B12(int x, int y) {
		System.out.println(x + "," + y);
	}
}
public class Inheritence12 {

	public static void main(String[] args) {
		B12 b = new B12(10, 20);

	}

}