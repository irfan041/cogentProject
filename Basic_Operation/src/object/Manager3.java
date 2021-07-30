package object;

public class Manager3 {
	public static void main(String[] args) {
		E e1 = new E(100);
		E e2 = new E(100);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}

class E {

	int i;

	E(int i) {
		this.i = i;
	}

	public String toString() {
		return "i=" + i;
	}

	public boolean equals(Object obj) {
		return (obj instanceof E) && (i == this.i);
	}
}
