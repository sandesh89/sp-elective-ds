package linkedlist;

public class Node {

	Page page;
	Node next;
	Node prev;

	public Node(Node prev, Page page, Node next) {
		super();
		this.page = page;
		this.next = next;
		this.prev = prev;
	}

}
