package Problems;

import java.util.*;

public class PreOrderIter {

	public static List<Integer> preOrder (TreeNode root){
		List<Integer> toBeReturned = new ArrayList<Integer>();
		Stack<TreeNode> container = new Stack<TreeNode>();
		if(root != null && (root.left != null || root.right != null)){
			container.push(root);
			TreeNode current = root;
			while(!container.isEmpty()){
				current = container.pop();
				toBeReturned.add(current.val);
				if(current.left != null || current.right != null){
					if(current.right != null)
						container.push(current.right);
					if(current.left != null)
						container.push(current.left);
				}
			}
		}
		else{
			if(root != null){
				toBeReturned.add(root.val);
			}
		}
		return toBeReturned;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode r1 = new TreeNode(2);
		TreeNode r2 = new TreeNode(3);

		root.right = r1;
		r1.left = r2;
		
		List<Integer> temp = preOrder(root);
		System.out.println(Arrays.deepToString(temp.toArray()));

	}

}
