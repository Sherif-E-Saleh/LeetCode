package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PostOrderIter {
	
	public static List<Integer> postOrder (TreeNode root){
		List<Integer> toBeRetunred = new ArrayList<Integer>();
		Stack<TreeNode> container = new Stack<TreeNode>();
		if(root != null && (root.left != null || root.right != null)){
			container.push(root);
			TreeNode justPoped = root;
			TreeNode current = root;
			while(!container.isEmpty()){
				if((current.left != null || current.right != null) && !oughtToBePoped(current, justPoped)){
					if(current.right != null)
						container.push(current.right);
					if(current.left != null)
						container.push(current.left);
				}
				else{
					justPoped = container.pop();
					toBeRetunred.add(justPoped.val);
				}
				if(!container.isEmpty())
					current = container.peek();
			}
		}
		else{
			if(root != null){
				toBeRetunred.add(root.val);
			}
		}
		return toBeRetunred;
	}
	
	public static boolean oughtToBePoped (TreeNode node, TreeNode recentlyPoped){
		boolean toBeReturned = false;
		if(node.right != null && node.right == recentlyPoped)
			toBeReturned = true;
		else{
			if(node.left != null && node.left == recentlyPoped)
				toBeReturned = true;
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
		
		List<Integer> temp = postOrder(root);
		System.out.println(Arrays.deepToString(temp.toArray()));

	}

}
