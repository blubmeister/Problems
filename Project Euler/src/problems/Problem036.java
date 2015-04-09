package problems;

import util.Timer;

public class Problem036 {

	public static void main(String[] args) {
		
		//TODO much faster by generating palindromes
		Timer.start();
		int sum = 0;
		for (int i = 1; i < 1000000; i++) {
			if (isPalindromic(i, 10) && isPalindromic(i, 2)) {
				sum += i;
			}
		}
		Timer.time();
		System.out.println(sum);
	}

	static boolean isPalindromic(int n, int base) {
		// leading zero
		if ((n & 1) == 0)
			return false;
		int copy = n;
		int reverse = 0;
		while (copy > 0) {
			reverse = base * reverse + copy % base;
			copy /= base;
		}
		return reverse == n;
	}
}
