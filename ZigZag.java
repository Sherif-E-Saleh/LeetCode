package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ZigZag {

	public static String convert(String s, int numRows) {
		ArrayList<ArrayList<Character>> holder = new ArrayList<ArrayList<Character>>();
		ArrayList<Character> temp;
		for (int i = 0; i < numRows; i++) {
			temp = new ArrayList<Character>();
			holder.add(temp);
		}
		boolean lastRow = false;
		for (int i = 0, j = 0, r = numRows - 1; i < s.length(); i++) {
			if (!lastRow) {
				holder.get(j).add(s.charAt(i));
				j++;
				if (j == numRows)
					lastRow = true;
			} else {
				r--;
				if (r >= 0) {
					holder.get(r).add(s.charAt(i));
					if (r == 0) {
						j = 1;
						lastRow = false;
						r = numRows - 1;

					}
				}
			}
		}

		String result = "";
		for (int i = 0; i < holder.size(); i++) {
			for (int j = 0; j < holder.get(i).size(); j++) {
				result = result + holder.get(i).get(j);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		System.out.println(convert(input, 2));
	}

}
