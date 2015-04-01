package problems;

public class Problem009 {

	static final int N = 1000;

	public static void main(String[] args) {

		int a, b, c;

		for (a = 1; a < (N - 3) / 3; a++) {
			for (b = a + 1; b < (N - a - 1) / 2; b++) {
				c = N - a - b;
				if (a * a + b * b == c * c) {
					System.out.println(a * b * c);
					return;
				}
			}
		}
	}
}
