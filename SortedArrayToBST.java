package Problems;

public class SortedArrayToBST {
	
	public static TreeNode buildTree (int [] nums){
		if(nums.length == 0)
			return null;
		else{
			int start = 0;
			int end = nums.length-1;
			int mid = nums.length/2;
			TreeNode root = new TreeNode (nums[mid]);
			partition (root, nums, start, mid);
			partition (root, nums, mid+1, end);
			return root;
		}
	}
	
	public static void partition (TreeNode root, int [] array, int start, int end){
		if(start > end)
			return;
		else{
			int mid = start + ((end-start)/2);
			TreeNode temp = new TreeNode (array[mid]);
			insert(root, temp);
			partition (root, array, start, mid);
			partition (root, array, mid+1, end);
		}
	}
	
	public static void insert (TreeNode root, TreeNode node){
		if(node.val < root.val && root.left == null)
			root.left = node;
		else if (node.val > root.val && root.right == null)
			root.right = node;
		else if (node.val < root.val && root.left != null)
			insert(root.left, node);
		else if (node.val > root.val && root.right != null)
			insert(root.right, node);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
