package problems;

import util.Primes;
import util.Timer;

public class Problem049 {

	static final int N = 10000;

	public static void main(String[] args) {
		Timer.start();
		boolean[] isPrime = Primes.getPrimes(N - 1);
		for (int a = N / 10 + 1; a < N - 4; a += 2) {
			if (isPrime[a]) {
				for (int b = a + 2; b < (a + N) / 2; b += 2) {
					if (isPrime[b] && isPrime[b + b - a] && arePermutated(a, b, b + b - a)) {
						 System.out.println(a + " " + b + " " + (b + b - a));
					}
				}
			}
		}
		Timer.time();
	}

	private static boolean arePermutated(int a, int b, int c) {
		int[] containsB = new int[10];
		int[] containsC = new int[10];
		while (a > 0) {
			containsB[a % 10]++;
			containsC[a % 10]++;
			a /= 10;
		}
		while (b > 0 || c > 0) {
			if (containsB[b % 10] == 0 || containsC[c % 10] == 0) {
				return false;
			}
			containsB[b % 10]--;
			containsC[c % 10]--;
			b /= 10;
			c /= 10;
		}
		return true;
	}
}
