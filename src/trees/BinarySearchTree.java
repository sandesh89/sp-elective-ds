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

	// A utility function to search a given key in BST
	public Node search(Node root, int key) {
		// Base Cases: root is null or key is present at root
		if (root == null || root.key == key)
			return root;

		// val is greater than root's key
		if (root.key > key)
			return search(root.left, key);

		// val is less than root's key
		return search(root.right, key);

	}
}
