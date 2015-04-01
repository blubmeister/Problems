package problems;

import util.Primes;
import util.Timer;

public class Problem007 {

	static final int N = 10001;

	public static void main(String[] args) {

		Timer.start();
		int n = 10;
		// Primzahldichte
		while (n / Math.log(n) < 1.2 * N) {
			n *= 10;
		}
		boolean[] isPrime = Primes.getPrimes(n);
		Timer.time();
		int count = 0;
		int result = 0;
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i])
				count++;
			if (count == N) {
				result = i;
				break;
			}
		}
		Timer.time();
		System.out.println(result);
	}
}
