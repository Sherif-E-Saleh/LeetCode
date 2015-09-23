package Problems;

import java.util.*;

public class StackWithTwoQueues {

	Queue<Integer> a = new LinkedList<Integer>();
	Queue<Integer> b = new LinkedList<Integer>();

	public void push(int i) {
		if (a.isEmpty()) {
			a.add(i);
			while (!b.isEmpty()) {
				a.add(b.poll());
			}
		} else if (b.isEmpty()) {
			b.add(i);
			while (!a.isEmpty()) {
				b.add(a.poll());
			}
		}
	}

	public void pop() {
		if (!a.isEmpty())
			a.poll();
		else if (!b.isEmpty())
			b.poll();
	}
	
	public int top(){
		int result = 0;
		if (!a.isEmpty())
			result = a.peek();
		else if (!b.isEmpty())
			result = b.peek();
		return result;
	}
	
	public boolean empty(){
		if(a.isEmpty() && b.isEmpty())
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
