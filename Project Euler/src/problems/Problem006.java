package problems;

import java.math.BigInteger;

public class Problem006 {

	static final int N = 100;

	public static void main(String[] args) {

		int sumOfSquare = 0;
		for (int i = 1; i <= N; i++) {
			sumOfSquare += i * i;
		}
		BigInteger squareOfSum = BigInteger.valueOf(N * (N + 1) / 2);
		BigInteger result = squareOfSum.pow(2).subtract(BigInteger.valueOf(sumOfSquare));

		System.out.println(result);
	}
}
