package problems;

import util.Timer;

public class Problem004 {

	static final int N = 999;

	public static void main(String[] args) {

		Timer.start();
		int largestPalindrome = 0;
		for (int i = N; i > N / 10; i--) {
			if (i * N < largestPalindrome) {
				break;
			}
			for (int j = i; j > N / 10; j--) {
				int value = i * j;
				if (value < largestPalindrome) {
					break;
				}
				if (isPalindrome(value)) {
					largestPalindrome = value;
				}
			}
		}
		Timer.time();
		System.out.println(largestPalindrome);
	}

	static int reverse(int num) {
		int result = 0;
		while (num > 0) {
			result *= 10;
			result += num % 10;
			num /= 10;
		}
		return result;
	}

	static boolean isPalindrome(int num) {

		// char[] digits = Integer.toString(num).toCharArray();
		// for (int i = 0; i < digits.length; i++) {
		// if (digits[i] != digits[digits.length - i - 1]) {
		// return false;
		// }
		// }
		return (num) == reverse(num);
	}
}
