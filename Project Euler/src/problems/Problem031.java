package problems;

public class Problem031 {

	static final int N = 200;
	static final int[] COINS = new int[] { 200, 100, 50, 20, 10, 5, 2, 1 };

	public static void main(String[] args) {

		int[] ways = new int[N + 1];
		ways[0] = 1;
		for (int coin : COINS) {
			for (int value = coin; value <= N; value++) {
				ways[value] += ways[value - coin];
			}
		}
		System.out.println(ways[N]);
	}
}
