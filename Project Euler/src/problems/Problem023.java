package problems;

import java.util.ArrayList;

import util.MyMath;
import util.Primes;

public class Problem023 {

	static final int N = 28123;

	public static void main(String[] args) {

		int[] primes = Primes.getPrimeNumbersUpTo(N);
		ArrayList<Integer> abundantNumberList = new ArrayList<>();
		for (int i = 2; i <= N; i++) {
			if (MyMath.sumOfDivisors(i, primes) - i > i) {
				abundantNumberList.add(i);
			}
		}

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + ": " + (MyMath.sumOfDivisors(i, primes) - i));
		}
		boolean[] canBeWritten = new boolean[N + 1];
		for (int i = 0; i < abundantNumberList.size(); i++) {
			for (int j = i; j < abundantNumberList.size() && (abundantNumberList.get(i) + abundantNumberList.get(j)) <= N; j++) {
				canBeWritten[abundantNumberList.get(i) + abundantNumberList.get(j)] = true;
			}
		}
		int result = 0;
		for (int i = 1; i <= N; i++) {
			if (!canBeWritten[i]) {
				result += i;
				// System.out.println(i);
			} else {

			}
		}
		System.out.println(result);
	}
}
