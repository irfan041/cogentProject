public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(7);
		test1();
}

	static void test1() throws ClassNotFoundException  {
		System.out.println(1);
		//try{
		test2();
		//}
		/*catch(ClassNotFoundException e){
			
		}*/
		System.out.println(2);
	}

	static void test2() throws ClassNotFoundException {
		System.out.println(1);
		
		test3();
		
		System.out.println(2);
	}

	static void test3() throws ClassNotFoundException {
		System.out.println(5);
		Class.forName("arg0");
		System.out.println(2);
	}

}
