package Problems;

import java.util.Stack;

public class BSTIterator {

	public Stack<TreeNode> container; 

	public BSTIterator(TreeNode root) {
		container = new Stack <TreeNode>();

		if(root != null){
			this.container.push(root);
			TreeNode temp = this.container.peek();
			while (temp.left != null) {
				this.container.push(temp.left);
				temp = temp.left;
			}
		}
	}

	public boolean hasNext() {
		if(container.isEmpty())
			return false;
		else
			return true;
	}

	public int next() {
		TreeNode minNode = this.container.pop();
		if (minNode.right != null) {
			TreeNode temp = minNode.right;
			do {
				this.container.push(temp);
				temp = temp.left;
			} while (temp != null);
		}
		return minNode.val;
	}

	public static void main(String[] args) {
		
		TreeNode node1 = new TreeNode (1);
		TreeNode node2 = new TreeNode (2);
		TreeNode node3 = new TreeNode (3);
		TreeNode node4 = new TreeNode (4);
		TreeNode node5 = new TreeNode (5);
		TreeNode node6 = new TreeNode (6);
		TreeNode node7 = new TreeNode (7);
		TreeNode node8 = new TreeNode (8);
		TreeNode node9 = new TreeNode (9);
		TreeNode node10 = new TreeNode (10);
		TreeNode node11 = new TreeNode (11);

		node10.left = node4;
		node10.right= node11;
		node4.left = node2;
		node4.right = node6;
		node2.left = node1;
		node2.right = node3;
		node6.left = node5;
		node6.right = node8;
		node8.left = node7;
		node8.right = node9;
		
		BSTIterator test = new BSTIterator(null);
		while(test.hasNext()){
			System.out.println(test.next());
		}
			
		
		
		
		
		


	}

}
