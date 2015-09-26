package Problems;

public class DFSLevelByLeve {
	
	public static int getHeight (TreeNode root){
		if(root == null)
			return 0;
		else{
			return Math.max(1 + getHeight(root.left),1 + getHeight(root.right));
		}
	}
	
	public static void printAllTree(TreeNode root){
		int height = getHeight(root);
		for (int i = 1; i < height; i++) {
			System.out.println("Level: "+i+"\n"+"---------");
			printLevel(root, i);	
			System.out.println("");
		}
	}
	
	public static void printLevel(TreeNode root, int level){
		if(root == null)
			return;
		if (level == 1){
			System.out.print(root.val+" ");
			return;
		}
		else{
			printLevel(root.left, level-1);
			printLevel(root.right, level-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node5.left = node6;
		node5.right = node7;
		
//		System.out.println(getHeight(node1));
		printAllTree(node1);
		

	}

}
