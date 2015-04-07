package problems;

import util.MyMath;

public class Problem024 {

	static final int N = 1000000;
	static final String DIGITS = "0123456789";

	public static void main(String[] args) {

		char[] digits = DIGITS.toCharArray();
		int n = N - 1;
		String answer = "";
		for (int i = 0; i < DIGITS.length() && n > 0; i++) {
			int j = DIGITS.length() - i;
			long faculty = MyMath.faculty(j);
			while (faculty > n) {
				faculty /= j--;
			}
			int digit = (int) (n / faculty);
			answer += digits[digit];
			System.arraycopy(digits, digit + 1, digits, digit, digits.length - digit - 1);
			n = (int) (n % faculty);
			if (n == 0) {
				answer += new String(digits, 0, digits.length - answer.length());
				break;
			}
		}
		System.out.println(answer);
	}
}
