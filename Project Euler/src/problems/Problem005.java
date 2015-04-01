package problems;

import util.Primes;

public class Problem005 {

	static final int N = 20;

	public static void main(String[] args) {

		long result = 1;
		boolean[] isPrime = Primes.getPrimes(N);
		for (int i = 2; i <= N; i++) {
			if (isPrime[i]) {
				for (int j = i; j <= N; j *= i) {
					result *= i;
				}
			}
		}
		System.out.println(result);
	}
}
