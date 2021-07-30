package DS;

public class List2 implements Cloneable {

	private static List2 instance;

	private List2() {
	}

	public static synchronized List2 getInstance()throws CloneNotSupportedException{
        if(instance == null){
            instance = new List2();
        }
        return instance;
	}
        @Override
        protected Object clone() throws CloneNotSupportedException {
              
        	throw new RuntimeException("clone not supported");
        }
    

	public static void main(String[] args) throws CloneNotSupportedException {
		List2 l1 = getInstance();
		List2 l3 = getInstance();
		System.out.println(l1.hashCode());
		System.out.println(l3.hashCode());
		List2 l2 = (List2) l3.clone();
		System.out.println(l2.hashCode());
	}
}
