package Problems;

public class Palindrome {

	public static boolean isPalindromeReverse (int x){
		if (x <0 ) return false;
		int temp = 0;
		int temp1 = x;
		while (temp1!=0){
			temp = temp*10 + temp1%10; 
			temp1=temp1/10;
		}
		return (temp == x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindromeReverse(3654564));
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		
	}

	
}
