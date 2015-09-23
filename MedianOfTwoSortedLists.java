package Problems;

import java.util.Arrays;

public class MedianOfTwoSortedLists {

	public static double find(int[] a, int[] b) {
		double result = 0;
		if (a.length == 0 && b.length == 0)
			return 0;
		else if (a.length == 1 && b.length == 1) {
			result = a[0] + b[0];
			result = result / 2;

		} else if (a.length == 0) {
			if (b.length % 2 == 0) {
				result = b[b.length / 2] + b[(b.length / 2) - 1];
				result = result / 2;
			} else
				result = b[b.length / 2];
		} else if (b.length == 0 || Arrays.equals(a, b)) {
			if (a.length % 2 == 0) {
				result = a[a.length / 2] + a[(a.length / 2) - 1];
				result = result / 2;
			} else
				result = a[a.length / 2];
		} else {
			double full_Length = a.length + b.length;
			int medianIndex = ((a.length + b.length) / 2);
			int[] count = new int[medianIndex+1];
			int i = 0, j = 0;
			for (int x = 0; x < count.length; x++) {
				if (i < a.length && j < b.length) {
					if (a[i] < b[j]) {
						count[x] = a[i];
						i++;
					} else if(b[j] < a[i]){
						count[x] = b[j];
						j++;
					} else {
						count [x] = a[i];
						if(x+1 < count.length)
							count [x+1] = b[j];
						i++;
						j++;
						x++;
					}
				} else {
					if (i == a.length) {
						count[x] = b[j];
						j++;
					}
					if (j == b.length) {
						count[x] = a[i];
						i++;
					}
				}

			}
			if (full_Length % 2 > 0)
				result = count[count.length - 1];
			else {
				result = count[count.length - 1] + count[count.length - 2];
				result = result / 2;
			}

		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1,7,8,10 };
		int[] b = { 0,2,6,8,11,12 };

		System.out.println(find(a, b));

	}

}
