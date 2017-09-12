package trees;

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	void printInorder() {
		System.out.println("\nPrinting in-order");
		printInorder(this.root);
	}

	private void printInorder(Node rootNode) {
		if (rootNode == null)
			return;

		printInorder(rootNode.left);
		System.out.print(rootNode.key + " ");
		printInorder(rootNode.right);
	}

	void insertNode(int key) {
		root = insertNode(root, key);
	}

	/* A recursive function to insert a new key in BST */
	private Node insertNode(Node root, int key) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertNode(root.left, key);
		else if (key > root.key)
			root.right = insertNode(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	public Node search(int key) {
		return search(this.root, key);
	}

	private Node search(Node root, int key) {
		// Base Cases: root is null or key is present at root
		if (root == null)
			return null;
		if (root.key == key)
			return root;

		// val is greater than root's key
		if (root.key > key)
			return search(root.left, key);

		// val is less than root's key
		return search(root.right, key);

	}

	void deleteKey(int key) {
		root = deleteNode(root, key);
	}

	/* A recursive function to insert a new key in BST */
	private Node deleteNode(Node root, int key) {
		/* Base Case: If the tree is empty */
		if (root == null)
			return root;

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = deleteNode(root.left, key);
		else if (key > root.key)
			root.right = deleteNode(root.right, key);

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.key = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteNode(root.right, root.key);
		}

		return root;
	}

	private int minValue(Node root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}
}
