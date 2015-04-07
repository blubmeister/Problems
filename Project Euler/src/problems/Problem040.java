package problems;

import util.MyMath;
import util.Timer;

public class Problem040 {

	static final int N = 1000000;

	public static void main(String[] args) {

		Timer.start();
		int n = 1;
		int position = 1;
		int result = 1;
		for (int i = 1;; i++) {
			int max = MyMath.ipow(10, i);
			for (int j = max / 10; j < max; j++) {
				if (position + i > n) {
					int pos = n - position;
					int digit = j / MyMath.ipow(10, i - pos - 1) % 10;
					result *= digit;
					n *= 10;
					if (n > N) {
						System.out.println(result);
						Timer.time();
						return;
					}
				}
				position += i;
			}
		}
	}
}
