package problems;

import util.Primes;
import util.Timer;

public class Problem027 {

	static final int N = 1000;
	static int[] primes = Primes.getPrimeNumbersUpTo(1000);
	static boolean[] isPrime = Primes.getPrimes(100000);

	public static void main(String[] args) {

		// TODO ineffizient
		Timer.start();
		int maxStreak = 0;
		int maxA = 0;
		int maxB = 0;
		for (int a = N - 1; a > -N; a--) {
			for (int b : primes) {
				int streak = 0;
				for (int n = 0; (n * n + n * a + b) > 1 && isPrime[n * n + n * a + b]; n++) {
					streak++;
				}
				if (streak > maxStreak) {
					maxStreak = streak;
					maxA = a;
					maxB = b;
					System.out.println(maxA + " " + maxB + " " + maxStreak);

				}
			}
		}
		Timer.time();
		System.out.println(maxA * maxB);
	}
}
