package Problems;

import java.util.HashSet;

public class SingleNumber {
	public static int SingleNumberII (int [] A){
		HashSet<Integer>x = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (x.contains(A[i])){
				x.remove(A[i]);
			}
			else{
			x.add(A[i]);
			}
		}
		return x.hashCode();
	}
	
	public static int SingleNumberIII (int [] A){
		HashSet<Integer>container = new HashSet<Integer>();
		HashSet<Integer>occurance = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (container.contains(A[i]) && !occurance.contains(A[i])){
				container.remove(A[i]);
			}
			else if (container.contains(A[i]) && occurance.contains(A[i])){
				occurance.remove(A[i]);
			}
			else if (!container.contains(A[i])){
				container.add(A[i]);
				occurance.add(A[i]);
			}
		}
		return container.hashCode();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] lamia = {2,3,9,12,9,12,9,2,2,12};
		System.out.println(SingleNumberIII(lamia));
		
	}

}
