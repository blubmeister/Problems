package problems;

import util.Timer;

public class Problem014 {

	static final int N = 1000000;

	public static void main(String[] args) {

		Timer.start();
		int[] lengths = new int[N + 1];
		lengths[1] = 1;
		long result = 1;
		int maxLength = 0;
		for (int i = 2; i <= N; i++) {
			int length = 0;
			long n = i;
			while (n >= i) {
				length++;
				if ((n & 1) == 0)
					n = n >> 1;
				else
					n = 3 * n + 1;
			}
			length = length + lengths[(int) n];
			if (length > maxLength) {
				result = i;
				maxLength = length;
			}
			lengths[i] = length;
		}
		Timer.time();
		System.out.println(result);
	}
}
