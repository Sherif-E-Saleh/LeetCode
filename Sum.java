package questions;

import java.util.Stack;

public class Sum {
	
	public static Stack<Integer> contain (ListNode head){
		Stack <Integer> container = new Stack <Integer>();
		while(head != null){
			container.push(head.val);
			head = head.next;
		}
		return container;
	}
	
	public static Stack <Integer> summing (Stack<Integer> container1, Stack<Integer> container2){
		Stack <Integer> result = new Stack <Integer>();
		int tempResult = 0;
		int carry = 0;
		while(!container1.isEmpty() || !container2.isEmpty()){
			if(!container1.isEmpty()&&!container2.isEmpty())
				tempResult = container1.pop()+container2.pop();
			else if(!container1.isEmpty()&&container2.isEmpty())
				tempResult = container1.pop();
			else if(!container2.isEmpty() && container1.isEmpty())
				tempResult = container2.pop();
			
			tempResult = tempResult+carry;
			result.push(tempResult%10);
			carry = tempResult/10;
		}
		if(carry > 0)
			result.push(carry);
		return result;
	}
	
	public static ListNode makeList(Stack<Integer> container){
		ListNode head = new ListNode(container.pop());
		ListNode temp = head;
		while(!container.isEmpty()){
			temp.next = new ListNode(container.pop());
			temp = temp.next;
		}
		return head;
	}

	public static ListNode sum3Nums (ListNode num1, ListNode num2, ListNode num3){
		Stack <Integer> result = summing(contain(num1), contain(num2));
		Stack <Integer> reverse = new Stack<Integer>();
		while(!result.isEmpty()){
			reverse.push(result.pop());
		}
		result = summing(reverse,contain(num3));
		return makeList(result);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode start = new ListNode(1);
		ListNode start1 = new ListNode(2);
		ListNode start2 = new ListNode(3);

		
		start.next = start1;
		start1.next = start2;
		
		ListNode start3 = new ListNode(3);
		ListNode start4 = new ListNode(4);
		
		start3.next = start4;

		ListNode start5 = new ListNode(2);
		ListNode start6 = new ListNode(9);
		
		start5.next = start6;


		
		ListNode result = sum3Nums(start, start3, start5);
		
		
		while (result != null){
			System.out.println(result.val);
			result = result.next;
		}

	}

}
