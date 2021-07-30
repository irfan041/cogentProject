package abstractdemo;

abstract class AbstractDemo{
	public AbstractDemo(){
	System.out.println("AbstractDemo");	
		}
}
class A1 extends AbstractDemo{
	void test() {
		System.out.println("Hello test");
	}
}
public class InnnerDemo {
	public static void main(String[] args) {
		AbstractDemo a1=new A1();	
		
	}

}
