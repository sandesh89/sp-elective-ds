package trees;

public class BinaryTreeMain {

	static void initializeTree(BinaryTree tree) {

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		initializeTree(tree);

		tree.printInorder();
		tree.printPreorder();
		tree.printPostorder();

		tree.printLevelOrder();
		tree.printInorderWithoutRecursion();
	}

}
