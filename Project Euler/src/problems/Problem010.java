package problems;

import util.Primes;

public class Problem010 {

	static final int N = 2000000;

	public static void main(String[] args) {

		boolean[] isPrime = Primes.getPrimes(N);
		long result = 2;
		for (int i = 3; i < N; i += 2) {
			if (isPrime[i])
				result += i;
		}
		System.out.println(result);
	}
}
