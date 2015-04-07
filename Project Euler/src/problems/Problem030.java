package problems;

import util.MyMath;
import util.Timer;

public class Problem030 {

	static final int N = 5;

	public static void main(String[] args) {
		Timer.start();
		int max = (int) (N * MyMath.ipow(9, N));
		int result = 0;
		for (int i = 10; i <= max; i++) {
			if (i == sumOfDigits(i, N))
				result += i;
		}
		Timer.time();
		System.out.println(result);
	}

	static int sumOfDigits(int n, int power) {

		int sum = 0;
		while (n > 0) {
			sum += MyMath.ipow(n % 10, power);
			n /= 10;
		}
		return sum;
	}
}
