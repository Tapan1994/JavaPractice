package Test;

public class BTpreOrder {
	// create TreeNode
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		// constructor
		TreeNode(int data) {
			this.data = data;

		}
	}

	// create BTS
	public static TreeNode createBinaryTree() {

		TreeNode rootNode = new TreeNode(50);
		TreeNode node30 = new TreeNode(30);
		TreeNode node10 = new TreeNode(10);
		TreeNode node20 = new TreeNode(20);
		TreeNode node60 = new TreeNode(60);
		TreeNode node40 = new TreeNode(40);
		TreeNode node70 = new TreeNode(70);

		rootNode.left = node30;
		rootNode.right = node60;

		node30.left = node10;
		node30.right = node20;

		node60.right = node40;
		node60.right = node70;

		return rootNode;
	}

	// preOrderTraversal-recursive solution NODE->LEFT->RIGHT
	public void PreOrderTraversal(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			PreOrderTraversal(root.left);
			PreOrderTraversal(root.right);
		}

	}

	// InOrderTraversal-recursive solution LEFT->NODE->RIGHT
	public void inOrderTraversal(TreeNode root) {
		if (root != null) {
			PreOrderTraversal(root.left);
			System.out.print(root.data + " ");
			PreOrderTraversal(root.right);
		}

	}

	// PostOrderTraversal-recursive solution LEFT->RIGHT->NODE
	public void postOrderTraversal(TreeNode root) {
		if (root != null) {
			PreOrderTraversal(root.left);
			PreOrderTraversal(root.right);
			System.out.print(root.data + " ");
		}

	}

	public static void main(String[] args) {

		BTpreOrder bt = new BTpreOrder();
		TreeNode rootNode = createBinaryTree();
		bt.PreOrderTraversal(rootNode);
		System.out.println("----------");
		bt.inOrderTraversal(rootNode);
		System.out.println("----------");
		bt.postOrderTraversal(rootNode);
		System.out.println("----------");
	}
}
