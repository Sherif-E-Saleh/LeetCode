package Problems;

public class IntegersDivider {
    public static int divide(int dividend, int divisor) {
    	int result = 0;
    	int temp1 = Math.abs(dividend);
    	int temp2 = Math.abs(divisor);
    	if (divisor == 1)
    		return dividend;
    	else{
	    	while (temp1-temp2>0){
	    		temp1-=temp2;
	    		result++;
	    	}
	    	if (dividend>0 && divisor>0)
	    		return result;
	    	else if ((dividend>0 && divisor<0) || (dividend<0 && divisor>0))
	    		return -result;
	    	else 
	    		return result;
    	}
    }
    
    public static int divider1 (int dividend, int divisor){
    	 long a=Math.abs((long)dividend);
         long b=Math.abs((long)divisor);
         long result=0;
         
         while (a>=b){
             long c=b;
             int i=0;
             while(c<=a){
                 a=a-c;
                 c=c<<1;
                 result+=1<<i;
                 i++;
             }
             
         }
         if (dividend<0&&divisor>0||dividend>0&&divisor<0){
             result=-result;
         }
         return (int)result;
    	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = 6;
		c<<=1;
		
		int result = 0;
		int i = 1;
		
		result += 1<<i;
		
		System.out.println(c);
		System.out.println(result);

	}

}
