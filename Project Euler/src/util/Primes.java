package util;

import java.util.Arrays;

public class Primes {

	public static boolean[] getPrimes(int max) {
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

	public static int[] getPrimeNumbersUpTo(int max) {
		boolean[] isPrime = getPrimes(max);
		int count = 1;
		for (int i = 3; i <= max; i += 2) {
			if (isPrime[i])
				count++;
		}
		int[] primes = new int[count];
		primes[0] = 2;
		int index = 1;
		for (int i = 3; i <= max; i += 2) {
			if (isPrime[i]) {
				primes[index++] = i;
			}
		}
		return primes;
	}
}
