package problems;

import java.util.HashSet;

import util.Timer;

public class Problem029 {

	static final int N = 100;

	public static void main(String[] args) {
		// TODO ekelhaft und langsam zusammengehackt

		Timer.start();
		HashSet<Double> set = new HashSet<>(N * N);
		for (int a = 2; a <= N; a++) {
			for (int b = 2; b <= N; b++) {
				set.add(Math.pow(a, b));
			}
		}
		Timer.time();
		System.out.println(set.size());
	}
}
