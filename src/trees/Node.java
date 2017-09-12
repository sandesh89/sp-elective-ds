package trees;

class Node {

	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = null;
		right = null;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + "]";
	}
	
	
	
	
	
	
}
