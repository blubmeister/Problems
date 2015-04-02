package problems;

import util.Timer;

public class Problem015 {

	static final int N = 20;

	static long[][] results = new long[N + 1][N + 1];

	public static void main(String[] args) {
		Timer.start();
		for (int i = 0; i <= N; i++) {
			results[0][i] = 1;
			results[i][0] = 1;
		}
		Timer.time();
		System.out.println(lattice(N, N));
	}

	public static long lattice(int x, int y) {
		if (results[x][y] != 0)
			return results[x][y];
		else {
			results[x][y] = lattice(x - 1, y) + lattice(x, y - 1);
			return results[x][y];
		}
	}
}
