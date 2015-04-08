package problems;

import util.Primes;

public class Problem050 {

	static final int N = 1000000;

	public static void main(String[] args) {

		boolean[] isPrime = Primes.getPrimes(N);
		int[] primes = Primes.getPrimeNumbersUpTo(N);
		int maxStreak = 0;
		int maxSum = 0;
		int startPrime = 0;
		for (int i = 0;; i++) {
			if (primes[i] * maxStreak > N)
				break;
			int sum = primes[i];
			int j = 1;
			int streak = 1;
			while (sum < N) {
				if (streak > maxStreak && isPrime[sum]) {
					maxStreak = streak;
					maxSum = sum;
					startPrime = primes[i];
				}
				streak++;
				sum += primes[i + j++];
			}
		}
		System.out.println("starting prime: " + startPrime + ", # of terms: " + maxStreak + ", prime: " + maxSum);

	}
}
