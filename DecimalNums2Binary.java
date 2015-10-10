package questions;

public class DecimalNums2Binary {

	/*
	 * Amazon Coding Test Problem 
	 * -------------------------- 
	 * Code for converting
	 * floating point decimal number to binary numbers. If the number cannot be
	 * converted, state so ... Mainly because lack of space when there is no end
	 * for the binary representation.
	 */

	public static String Dec2Binary(double number) {
		String x = Double.toString(number);
		int n = x.indexOf('.');
		x = Integer.toBinaryString(Integer.parseInt(x.substring(0, n))) + "."
				+ floatingPointVal(x.substring(n + 1, x.length()));
		return x;
	}

	public static String floatingPointVal(String str) {
		str = "0." + str;
		double d = Double.parseDouble(str);
		str = "";
		while (d > 0) {
			double r = d * 2;
			if (r >= 1) {
				str = str + "1";
				d = r - 1;
			} else {
				str = str + "0";
				d = r;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Testing ...
		System.out.println(Dec2Binary(100.3));

	}

}
