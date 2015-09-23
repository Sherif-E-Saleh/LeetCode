package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {
	
	public static List<List<Integer>> traverse (TreeNode root){
			List<List<Integer>> toBeReturned = new  ArrayList<List<Integer>>();
			List<Integer> temp = new ArrayList<Integer>();
			Queue <TreeNode> container = new LinkedList<TreeNode>();
			container.add(root);
			if(root != null && (root.left != null || root.right != null))
				return trace(root, container, toBeReturned);
			else{
				if(root != null){
					temp.add(root.val);
					toBeReturned.add(temp);
				}
				
			}
			return toBeReturned;
	}
	public static List<List<Integer>>trace (TreeNode root, Queue <TreeNode> container, List<List<Integer>>array){
		List<Integer> temp = new ArrayList<Integer>();
		double missing = 0;
		int level = 0;
		double counter = 0;
		while(!container.isEmpty()){
			TreeNode tempNode = container.poll();
			if(tempNode != null){	
				container.add(tempNode.left);
				container.add(tempNode.right);
				if(level%2 == 0)
					temp.add(tempNode.val);
				else
					temp.add(0,tempNode.val);
				counter = counter+1;
			}
			
			else{
				counter++;
				missing++;
				
			}
			
			if(counter >= Math.pow(2, level)){
				if(!temp.isEmpty())
					array.add(0, temp);
				temp = new ArrayList<Integer>();
				level++;
				missing = 2*missing;
				counter = missing;

			}
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(-150);
		TreeNode root1;
		TreeNode temp = root;
		for (int i = -149; i < 601; i++) {
			root1 = new TreeNode(i);
			temp.right = root1;
			temp = temp.right;
		}
		List<List<Integer>> test = traverse(root);
		
		for (int i = 0; i < test.size(); i++) {
			System.out.println(Arrays.deepToString(test.get(i).toArray()));
		}

	}

}
