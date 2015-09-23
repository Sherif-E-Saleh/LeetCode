package Problems;

import java.util.HashMap;

public class TwoSums {

	public static int [] twoSum(int [] input, int target){
		HashMap <Integer, Integer> map = new HashMap <Integer, Integer>(); 	//(key is the difference, value is the address of the element from which we found this difference)
		int [] output = new int[2];
		for (int i = 0; i < input.length; i++) {
			if(map.containsKey(input[i])){
				//MODIFY THE FUCKING LOGIC
				int x = i;
				int y = map.get(input[i]);
				//Case 1: the original element is LARGER
				if(y > x){
					output[0] = i+1;
					output[1] = map.get(input[i])+1;
				}
				else{
					output[0] = map.get(input[i])+1;
					output[1] = i+1;

				}
			}
			else
				map.put(target-input[i], i);
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] test = {-1,-2,-3,-4,-5};
		int [] result = twoSum(test, -8);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
