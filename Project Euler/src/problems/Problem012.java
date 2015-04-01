package problems;

import util.Primes;

public class Problem012 {

	static final int N = 500;
	static final int[] PRIMES = Primes.getPrimeNumbersUpTo(10000);

	public static void main(String[] args) {

		long triangle = 1;
		int i = 2;

		while (numberOfDivisors(triangle) <= N) {
			triangle += i++;

			System.out.println(triangle + ": " + numberOfDivisors(triangle));
		}
	}

	private static int numberOfDivisors(long triangle) {
		int overAllCount = 1;
		for (int prime : PRIMES) {
			int count = 0;
			if (prime > triangle)
				break;
			else
				while (triangle % prime == 0) {
					triangle /= prime;
					count++;
				}
			if (count > 0) {
				overAllCount *= count + 1;
			}
		}
		return overAllCount;
	}
}
