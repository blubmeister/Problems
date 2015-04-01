package util;

import java.util.Arrays;

public class Primes {

	static boolean[] getPrimes(int max) {
		boolean[] isPrime = new boolean[max + 1];
		Arrays.fill(isPrime, 2, isPrime.length - 1, true);
		for (int i = 2; i * i < isPrime.length; i++) {
			if (!isPrime[i]) {
				continue;
			}
			for (int j = i * i; j < isPrime.length; j += i) {
				isPrime[j] = false;
			}
		}
		return isPrime;
	}
}
