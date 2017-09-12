package trees;

public class BSTTraversal {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insertNode(1);
		tree.insertNode(5);
		tree.insertNode(3);
		tree.insertNode(4);
		tree.insertNode(2);

		tree.printInorder();

		System.out.println("\nSearching element: " + tree.search(5) );
	}

}
