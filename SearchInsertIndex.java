package Problems;

public class SearchInsertIndex {
	
	public class Solution {
	    public int searchInsert(int[] A, int target) {
	        
	        int index = 0;
	        for (int i = 0; i < A.length; i++) {
	            
	            if (A[i] >= target){
	                index = i;
	                break;
	            }
	            else if (i == (A.length)-1){
	                index = A.length;
	            }
				
			
			}
	        
	        return index;
	        
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
