package abstractdemo;

public class Demo {

	public static void main(String args[]) {

		Dev d = new Dev();
		System.out.println(d.divide(null, 0));
		System.out.println("After division");

	}

}

class Dev {
	Integer divide(Integer a, Integer b) {
		return a / b;
	}
}
