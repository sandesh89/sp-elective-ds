package trees;

public class BstMain {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insertNode(1);
		tree.insertNode(5);
		tree.insertNode(3);
		tree.insertNode(4);
		tree.insertNode(2);

		tree.printInorder();

		int key = 5;
		System.out.println("\nSearching element: "+ key + " " + tree.search(key) );
		
		
		tree.deleteKey(key);
		
		System.out.println("\nSearching element: "+ key + " " + tree.search(key) );
		
		tree.insertNode(key);
		
		System.out.println("\nSearching element: "+ key + " " + tree.search(key) );
	}

}
