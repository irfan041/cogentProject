package DS;

public class IrfanLinkedList {
	Node1 head;
	static int size = 0;

	void insert(int data) {
		size++;
		Node1 node = new Node1();
		node.setData(data);
		node.setNext(null);
		if (head == null) {
			head = node;
		} else {
			Node1 current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}

	}

	void display() {
		Node1 node = head;
		while (node.getNext() != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
		System.out.println(node.getData());
	}

}
