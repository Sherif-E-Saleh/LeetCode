package Problems;

public class ReverseInt {
	
	public static int reverse (int x){
		char [] r = (Integer.toString(x)).toCharArray();
		char [] y = new char [r.length];
		if (r[0]=='-'){
			y[0] = r[0];
			for (int i = r.length-1; i > 0; i--) {
				y[(y.length) - i] = r[i];
				}
		}
		else{
			for (int i=r.length-1; i>=0; i--){
				y[(y.length-1) -i] = r[i];
			}
					
			}
		return (Integer.parseInt(new String (y)));
			}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse (123));
	}

}
