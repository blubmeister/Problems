package problems;

public class Problem043 {

	static long sum;

	public static void main(String[] args) {

		// TODO fokken bad
		perm2(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 10);
		System.out.println(sum);
	}

	static void perm2(int[] a, int n) {
		if (n == 1) {
			if (isCorrect(a)) {
				long number = a[9] + 10L * a[8] + 100L * a[7] + 1000L * a[6] + 10000L * a[5] + 100000L * a[4] + 1000000L * a[3] + 10000000L * a[2]
						+ 100000000L * a[1] + 1000000000L * a[0];
				sum += number;
			}
			return;
		}
		for (int i = 0; i < n; i++) {
			swap(a, i, n - 1);
			perm2(a, n - 1);
			swap(a, i, n - 1);
		}
	}

	// swap the characters at indices i and j
	static void swap(int[] a, int i, int j) {
		int b;
		b = a[i];
		a[i] = a[j];
		a[j] = b;
	}

	static boolean isCorrect(int[] a) {
		return (a[0] != 0 && (a[9] + 10 * a[8] + 100 * a[7]) % 17 == 0 && (a[8] + 10 * a[7] + 100 * a[6]) % 13 == 0
				&& (a[7] + 10 * a[6] + 100 * a[5]) % 11 == 0 && (a[6] + 10 * a[5] + 100 * a[4]) % 7 == 0 && (a[5] + 10 * a[4] + 100 * a[3]) % 5 == 0
				&& (a[4] + 10 * a[3] + 100 * a[2]) % 3 == 0 && (a[3] + 10 * a[2] + 100 * a[1]) % 2 == 0);
	}
}
