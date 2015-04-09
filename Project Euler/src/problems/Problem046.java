package problems;

import util.Primes;
import util.Timer;

public class Problem046 {

	static final int N = 10000;

	public static void main(String[] args) {

		Timer.start();
		boolean[] isSum = new boolean[N];
		int[] primes = Primes.getPrimeNumbersUpTo(N);
		for (int prime : primes) {
			for (int i = 0; 2 * i * i < N - prime; i++) {
				isSum[prime + 2 * i * i] = true;
			}
		}
		for (int i = 3; i < N; i += 2) {
			if (!isSum[i])
				System.out.println(i);
		}
		Timer.time();
	}
}
