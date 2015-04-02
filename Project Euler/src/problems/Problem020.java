package problems;

import java.math.BigInteger;

import util.Timer;

public class Problem020 {

	static final int N = 100;

	public static void main(String[] args) {

		Timer.start();
		BigInteger value = BigInteger.ONE;
		for (int i = 2; i <= N; i++) {
			value = value.multiply(BigInteger.valueOf(i));
		}
		int result = 0;
		String string = value.toString();
		for (int i = 0; i < string.length(); i++) {
			result += string.charAt(i) - '0';
		}
		Timer.time();
		System.out.println(result);
	}
}
