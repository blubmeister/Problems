package problems;

import util.Timer;

public class Problem026 {

	static final int N = 1000;

	public static void main(String[] args) {

		Timer.start();
		boolean[] falseArray = new boolean[N + 1];
		boolean[] restExisted = new boolean[N + 1];
		int[] cyclePos = new int[N + 1];
		int maxStreak = 0;
		int maxN = 0;

		for (int d = N - 1; d > maxStreak; d--) {
			int rest = 1;
			int streak = 0;
			while (!restExisted[rest] && rest > 0) {
				cyclePos[rest] = streak;
				streak++;
				restExisted[rest] = true;
				rest *= 10;
				rest = rest % d;
			}
			System.arraycopy(falseArray, 0, restExisted, 0, d);
			if (streak - cyclePos[rest] > maxStreak) {
				maxStreak = streak - cyclePos[rest];
				maxN = d;
			}
		}
		Timer.time();
		System.out.println(maxN);
	}
}
