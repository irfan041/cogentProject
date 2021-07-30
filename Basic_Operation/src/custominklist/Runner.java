package custominklist;

public class Runner {

	public static void main(String[] args) {
		MyLinkedList ml=new MyLinkedList();
		ml.insertAtBeg(10);
		ml.insertAtBeg(20);
		ml.insertAtBeg(30);
		ml.show();
		System.out.println(ml.size);
	}

}
