package problems;

import java.math.BigInteger;

import util.Timer;

public class Problem048 {

	static final int N = 1000;

	public static void main(String[] args) {
		Timer.start();
		BigInteger result = BigInteger.ZERO;
		BigInteger mod = BigInteger.valueOf(10000000000L);
		for (int i = 1; i <= N; i++) {
			result = result.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), mod));
		}
		Timer.time();
		System.out.println(result.mod(mod));
	}
}
