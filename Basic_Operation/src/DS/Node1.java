package DS;

public class Node1 {
	int data;
	Node1 next;

	
	public Node1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Node1(int data, Node1 next) {
		//super();
		this.data = data;
		this.next = next;
	}


	public int getData() {
		return data;
	}

	
	public void setData(int data) {
		this.data = data;
	}

	
	public Node1 getNext() {
		return next;
	}

	
	public void setNext(Node1 next) {
		this.next = next;
	}

}
