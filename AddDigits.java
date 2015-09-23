package Problems;

public class AddDigits {
	
	public static int add (int num){
		if(num < 10)
			return num;
		else{
			int sum = 0;
			while(num > 0){
				sum = sum + num % 10;
				num = num /10;
			}
			if(sum >= 10)
				return add(sum);
			else
				return sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add (38));
	}

}
