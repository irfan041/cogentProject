package DS;

public class Demo12345 {
public static void main(String[] args) {
		A1234 a1=new A1234(10);
		A1234 a2=new A1234(10);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));

	}

}

class A1234{
	int x;
	A1234(int x){
		this.x=x;
	}
}

