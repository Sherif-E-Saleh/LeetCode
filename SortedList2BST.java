package Problems;

public class SortedList2BST {
	
	public static ListNode h;
	
	public static TreeNode sortedListToBST (ListNode head){
		if(head == null)
			return null;
		else{
			h = head;
			int length = getLength(head);
			return list2BST(0, length-1);
		}
	}
	
	public static int getLength(ListNode node){
		int n = 0;
		ListNode l = node;
		while(l != null){
			n++;
			l = l.next;
		}
		return n;
	}
	
	public static TreeNode list2BST (int start, int end){
		if(start > end)
			return null;
		else{
			int mid = (start + end) / 2;
			TreeNode left = list2BST(start, mid - 1);
			TreeNode parent = new TreeNode(h.val);
			h = h.next;
			TreeNode right = list2BST(mid + 1, end);
			parent.left = left;
			parent.right = right;
			return parent;
		}
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode x = new ListNode (3);
		ListNode y = new ListNode (5);
		ListNode z = new ListNode (8);
		
		x.next = y;
		y.next = z;		
		

	}

}
