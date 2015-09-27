package Problems;

public class BinaryTreeLCA {

	//Approach 1: Top-Down O(n) and worst case takes O(n)^2 : n is the number of nodes
	
	public static int countMatches(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			return 0;
		int matching = countMatches(root.left, p, q)
				+ countMatches(root.right, p, q);
		if (root == p || root == q)
			return 1 + matching;
		else
			return matching;
	}

	public static TreeNode getLowestCommonAncestors(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || p == null || q == null)
			return null;
		else if (root == p || root == q)
			return root;
		else {
			int leftMatches = countMatches(root.left, p, q);
			if(leftMatches == 1)
				return root;
			else if(leftMatches == 2)
				return getLowestCommonAncestors(root.left, p, q);
			else
				return getLowestCommonAncestors(root.right, p, q);
		}
	}
	
	//Approach 2: Bottom-Up Approach O(n) and the worst case O(n) : n is the number of nodes
	// Problem: Lowest Common Ancestor of Binary Tree #Leetcode
	// Solution: Beats 99.79% of the submitted solutions.
	
	public static TreeNode getLowestCommonAncestorBU(TreeNode root, TreeNode p, TreeNode q){
		if(root == null)
			return null;
		if(root == p || root == q)
			return root;
		TreeNode left = getLowestCommonAncestorBU(root.left, p, q);
		TreeNode right = getLowestCommonAncestorBU(root.right, p, q);
		if(left != null && right != null)
			return root;
		else if(left != null)
			return left;
		else
			return right;
	}

	public static void main(String[] args) {

		//Testing 
		
		TreeNode node1 = new TreeNode(7);
		TreeNode node2 = new TreeNode(8);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(9);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(10);
		TreeNode node7 = new TreeNode(2);
		TreeNode node8 = new TreeNode(1);
		TreeNode node9 = new TreeNode(4);
		TreeNode node10 = new TreeNode(11);
		TreeNode node11 = new TreeNode(3);
		TreeNode node12 = new TreeNode(12);
		TreeNode node13 = new TreeNode(13);
		TreeNode node14 = new TreeNode(14);

		node1.left = node2;
		node1.right = node3;

		node2.left = node4;
		node2.right = node5;

		node3.right = node6;

		node4.left = node7;
		node4.right = node8;

		node5.left = node9;

		node6.left = node10;

		node9.left = node11;

		node10.left = node12;

		node10.right = node13;

		node13.right = node14;
		
		System.out.println(getLowestCommonAncestorBU(node1, node8, node9).val);
	}

}
