package util;

public class MyMath {

	public static long faculty(int n) {
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static long binomial(int n, int k) {
		long result = 1;
		for (int j = 1; j <= k; j++) {
			result = result * (n + 1 - j) / j;
		}
		return result;
	}

	public static long multinomial(int n, int[] k) {
		long result = faculty(n);
		for (int i : k) {
			result /= faculty(i);
		}
		return result;
	}

	public static int sumOfDivisors(int N, int[] primes) {

		int result = 1;
		int n = N;
		for (int p : primes) {
			int count = p;
			if (n % p == 0) {
				n /= p;
				count *= p;
				while (n % p == 0) {
					n /= p;
					count *= p;
				}
				result *= (count - 1) / (p - 1);
			}
			if (n == 1)
				return result;
		}
		return -1;
	}

	public static int ipow(int base, int exp) {
		int result = 1;
		while (exp > 0) {
			if ((exp & 1) != 0)
				result *= base;
			exp >>= 1;
			base *= base;
		}

		return result;
	}

	public static long modpow(long base, long exp, long modulus) {
		long result = 1;
		base = base % modulus;
		while (exp > 0) {
			if ((exp & 1) != 0)
				result = (result * base) % modulus;
			exp >>= 1;
			base = (base * base) % modulus;
		}
		return result;
	}
}
