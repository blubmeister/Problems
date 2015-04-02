package problems;

import java.math.BigInteger;

import util.Timer;

public class Problem016 {

	public static void main(String[] args) {
		Timer.start();
		BigInteger value = BigInteger.valueOf(2);
		value = value.pow(1000);
		String string = value.toString();
		int result = 0;
		for (int i = 0; i < string.length(); i++) {
			result += string.charAt(i) - '0';
		}
		Timer.time();
		System.out.println(result);
	}
}
