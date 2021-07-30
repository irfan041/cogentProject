package object;

public class ToStringDemo {

	public static void main(String[] args) {
		D d1=new D(10,20);
		D d2=new D(30,40);
		System.out.println(d1);
		System.out.println(d2);

	}

}
class D{
	int i;
	int j;
	D(int i,int j){
		
		this.i=i;
		this.j=j;
	}
	
}
