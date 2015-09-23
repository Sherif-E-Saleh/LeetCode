package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class InOrderTravIter {

	public static List <Integer> inOrderTrav (TreeNode root){
		List<Integer> toBeReturned = new ArrayList <Integer>();
		ArrayList<TreeNode> visitedNodes = new ArrayList<TreeNode>();
		Stack<TreeNode> container = new Stack<TreeNode>();
		if(root != null && (root.left != null || root.right != null)){
			container.push(root);
			TreeNode justPoped = root;
			TreeNode current = root;
			while (!container.isEmpty()){
				if(current.left != null && current.left != justPoped && !visitedNodes.contains(current.left)){
					container.push(current.left);
				}
				else if(current.left == null || (current.left == justPoped) || visitedNodes.contains(current.left)){
					justPoped = container.pop();
					toBeReturned.add(justPoped.val);
					visitedNodes.add(justPoped);
					if(justPoped.right!=null)
						container.push(justPoped.right);
				}
				if(!container.isEmpty())
					current = container.peek();
					
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
		TreeNode root = new TreeNode(3);
		TreeNode r1 = new TreeNode(1);
		TreeNode r2 = new TreeNode(2);

		root.left = r1;
		r1.right = r2;
		
		List<Integer> temp = inOrderTrav(root);
		System.out.println(Arrays.deepToString(temp.toArray()));
	}

}
