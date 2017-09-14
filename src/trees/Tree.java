package trees;

public interface Tree {
	 
	//DFS
	public void printInorder();
	public void printInorderWithoutRecursion();
	public void printPreorder();
	public void printPostorder();

	//BFS
	public void printLevelOrder();
	
	public void insertNode(int key);
	public Node search(int key);
	
	public void deleteKey(int key);
	
}
