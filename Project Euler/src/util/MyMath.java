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
}
