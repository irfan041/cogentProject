package custominklist;
public class MyLinkedList {
	Node1 head;
	int size=0;

	public void insertAtBeg(int data) {
		size++;
		Node1 node = new Node1();
		
		node.data = data;
		node.link = null;
		if (head == null) {
			head = node;
		} else {
			Node1 n = head;
			while (n.link != null) {
				n = n.link;
			}
			n.link = node;

		}
	}
	public void insertAtEnd(int data) {
		size++;
		Node1 node = new Node1();
		
		node.data = data;
		node.link = null;
		if (head == null) {
			head = node;
		} else {
			Node1 n = head;
			while (n.link != null) {
				n = n.link;
			}
			n.link = node;

		}
	}
	
	public void show() {
		Node1 node = head;
		while (node.link != null) {
			System.out.println(node.data);
			node = node.link;
		}
		System.out.println(node.data);
	}
}
