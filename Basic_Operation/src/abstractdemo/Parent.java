package abstractdemo;

class Base{
	void test1() {
		
		
	}
	
	
}
class Child extends Base{
	void test2() {
		
	}
	
	
}
public class Parent {
	public static void main(String[] args) {
		
		Child c=(Child)new Base();
		c.test1();
		
		
	}

}
