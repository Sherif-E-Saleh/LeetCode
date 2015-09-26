package Problems;

import java.util.ArrayList;
import java.util.Arrays;


public class TreeBoundaries {

	public static ArrayList<Integer> output = new ArrayList<Integer>();

	public static void printEdges(TreeNode root) {
		printleft(root);
		output.remove(output.size() - 1);
		printLeaves(root);
		printRight(root.right, output.size() - 1);
		output.remove(output.size() - 1);

	}

	public static void printleft(TreeNode root) {
		if (root == null)
			return;
		else {
			output.add(root.val);
			printleft(root.left);
			if (root.left == null && root.right != null)
				printleft(root.right);
		}
	}

	public static void printLeaves(TreeNode root) {
		if (root.left == null && root.right == null) {
			output.add(root.val);
			return;
		} else {
			if (root.left != null)
				printLeaves(root.left);
			if (root.right != null)
				printLeaves(root.right);
		}
	}

	public static void printRight(TreeNode root, int slot) {
		if (root == null)
			return;
		else {
			output.add(slot, root.val);
			;
			printRight(root.right, slot);
			if (root.right == null && root.left != null)
				printRight(root.left, slot);
		}
	}

	public static void main(String[] args) {

		// Testing

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

		printEdges(node1);
		System.out.println(Arrays.toString(output.toArray()));
		// output [7, 8, 9, 2, 1, 3, 12, 14, 13, 11, 10, 6]

	}

}
