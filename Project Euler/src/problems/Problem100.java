package problems;

public class Problem100 {

	static final long N = 1_000_000_000_000L;

	public static void main(String[] args) {

		int n = 1;
		while (a(n) < N) {
			n++;
		}
		System.out.println(a(n - 1));
	}

	static int countOf2(long n) {
		int result = 0;
		while ((n & 1) == 0) {
			result++;
			n >>= 1;
		}
		return result;
	}

	// übel gecheated :<
	static long a(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 3;
		if (n == 3)
			return 15;
		return 7 * (a(n - 1) - a(n - 2)) + a(n - 3);
	}
}
