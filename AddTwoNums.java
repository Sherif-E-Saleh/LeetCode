package Problems;


public class AddTwoNums {

	public static ListNode add (ListNode l1, ListNode l2){
		if(l1 == null && l2 != null)
			return l2;
		else if (l1 != null && l2 == null)
			return l1;
		else if(l1 == null && l2 == null)
			return null;
		else{
			int carry = 0;
			int sum = 0;
			ListNode temp = new ListNode ((l1.val+l2.val)%10);
			carry = (l1.val + l2.val)/10;
			l1 = l1.next;
			l2=l2.next;
			ListNode temp2;
			ListNode pointer = temp;
			while (l1 != null || l2 != null){
				if(l1 != null && l2 != null){
					sum = l1.val + l2.val;
					if(carry == 1)
						sum++;
					temp2 = new ListNode (sum%10);
					carry = sum/10;
					pointer.next = temp2;
					pointer = pointer.next;
				}
				else if (l1 == null){
					sum = l2.val;
					if(carry == 1)
						sum ++;
					carry = sum/10;
					temp2 = new ListNode (sum%10);
					pointer.next = temp2;
					pointer = pointer.next;
				}
				else if (l2 == null){
					sum = l1.val;
					if(carry == 1)
						sum ++;
					carry = sum/10;
					temp2 = new ListNode (sum%10);
					pointer.next = temp2;
					pointer = pointer.next;
				}
				if(l1 != null)
					l1 = l1.next;
				if(l2 != null)
					l2 = l2.next;
			}
			if(carry == 1){
				temp2 = new ListNode (1);
				pointer.next = temp2;
				pointer = pointer.next;
			}
			
			return temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode l11 = new ListNode (1);
//		ListNode l13 = new ListNode (8);
//		l11.next = l13;
		
		ListNode l21 = new ListNode (9);
		ListNode l22 = new ListNode (9);
		l21.next = l22;
//		ListNode l23 = new ListNode (4);
//		l22.next = l23;
//		
		ListNode sol = add(l11, l21);
		while(sol != null) {
			System.out.println(sol.val);
			sol = sol.next;
		}



		
		}
	}


