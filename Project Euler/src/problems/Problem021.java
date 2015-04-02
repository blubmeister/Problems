package problems;

public class Problem021 {

	static final int N = 10000;

	// not really correct, doesn't find amicable numbers where one number of the pair is >= N

	public static void main(String[] args) {

		int[] sums = new int[N + 1];

		for (int i = 1; i < N; i++) {
			for (int j = 2 * i; j <= N; j += i) {
				sums[j] += i;
			}
		}
		int result = 0;
		for (int i = 1; i < N; i++) {
			if (sums[i] < N && sums[sums[i]] == i && sums[i] != i) {
				result += i;
			}
		}
		System.out.println(result);
	}
}
