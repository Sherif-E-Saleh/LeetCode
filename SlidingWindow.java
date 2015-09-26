package Problems;

import java.util.Arrays;

public class SlidingWindow {

	public static int[] maxSlidingWindow(int[] nums, int k) {

		// handle the case of having the window size is equal to "nums" length

		if (nums.length <= 1 || k == 1) {
			return nums;
		}

		int[] toBeReturned = new int[nums.length - k + 1];
		int max = nums[0];
		int inIndex = 0;
		int in = 0;
		int outIndex = 0;
		int out = 0;
		for (int i = 1; i < k; i++) {
			if (max < nums[i])
				max = nums[i];
		}

		if (k < nums.length){
			 inIndex = k;
			 in = nums[inIndex];
			 outIndex = 0;
			 out = nums[outIndex];
		}
			toBeReturned[0] = max;
		for (int i = 1; i < toBeReturned.length; i++) {
			if (out == max) {
				if (in >= out)
					max = in;
				else {
					max = nums[outIndex + 1];
					for (int j = outIndex + 2; j < inIndex + 1; j++) {
						if (max < nums[j])
							max = nums[j];
					}
				}
			} else {
				if (in > max)
					max = in;
			}
			toBeReturned[i] = max;

			if (inIndex + 1 < nums.length) {
				inIndex = inIndex + 1;
				in = nums[inIndex];
			}
			if (outIndex + 1 < nums.length) {
				outIndex = outIndex + 1;
				out = nums[outIndex];
			}

		}
		return toBeReturned;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] test = { 7,2,4 };
		int[] output = maxSlidingWindow(test, 2);

		System.out.println(Arrays.toString(output));
	}

}
