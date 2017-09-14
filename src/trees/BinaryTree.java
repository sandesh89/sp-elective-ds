package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree implements Tree{

	Node root;

	BinaryTree() {
		root = null;
	}

	@Override
	public void printInorder() {
		System.out.println("\nPrinting in-order");
		printInorder(this.root);
	}

	@Override
	public void printPreorder() {
		System.out.println("\nPrinting pre-order");
		printPreorder(this.root);
	}
	
	@Override
	public void printPostorder() {
		System.out.println("\nPrinting post-order");
		printPostorder(this.root);
	}

	@Override
	public void printLevelOrder() {
		System.out.println("\nBFS traversal ");
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(this.root);
		while (!queue.isEmpty()) {

			// Get the head element
			Node tempNode = queue.poll();
			System.out.print(tempNode.key + " ");

			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

	@Override
	public void printInorderWithoutRecursion() {
		System.out.println("\nInorder traversal using Stack");
		if (this.root == null) {
			return;
		}

		Stack<Node> stack = new Stack<Node>();
		Node node = this.root;

		// first node to be visited will be the left one
		while (node != null) {
			stack.push(node);
			node = node.left;
		}

		// traverse the tree
		while (stack.size() > 0) {

			// visit the top node
			node = stack.pop();
			System.out.print(node.key + " ");
			if (node.right != null) {
				node = node.right;

				// the next node to be visited is the leftmost
				while (node != null) {
					stack.push(node);
					node = node.left;
				}
			}
		}
	}

	@Override
	public void insertNode(int key) {
		// TODO Implementation to be added later
		
	}

	@Override
	public Node search(int key) {
		// TODO Implementation to be added later
		return null;
	}

	@Override
	public void deleteKey(int key) {
		// TODO Implementation to be added later
		
	}
	
	/* Private methods internal to this class only */

	private void printInorder(Node rootNode) {
		if (rootNode == null)
			return;

		printInorder(rootNode.left);
		System.out.print(rootNode.key + " ");
		printInorder(rootNode.right);
	}

	private void printPreorder(Node rootNode) {
		if (rootNode == null)
			return;

		System.out.print(rootNode.key + " ");
		printPreorder(rootNode.left);
		printPreorder(rootNode.right);
	}

	private void printPostorder(Node rootNode) {
		if (rootNode == null)
			return;

		printPostorder(rootNode.left);
		printPostorder(rootNode.right);
		System.out.print(rootNode.key + " ");
	}



}
