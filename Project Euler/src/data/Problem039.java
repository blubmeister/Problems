package data;


public class Problem039 {

	static final int N = 1000;

	public static void main(String[] args) {

		int maxSum = 0;
		int maxP = 0;
		for (int p = 2; p <= N; p += 2) {
			int sum = 0;
			int fac = (int) (p / (2 + Math.sqrt(2)));
			for (int a = 1; a < fac; a++) {
				if ((p * (p - 2 * a)) % (2 * (p - a)) == 0)
					sum++;
			}
			if (sum > maxSum) {
				maxSum = sum;
				maxP = p;
			}
		}
		System.out.println(maxP);
	}
}
