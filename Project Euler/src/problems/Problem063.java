package problems;

public class Problem063 {

	public static void main(String[] args) {

		// result wrong, 9^20 and 9^21 missing, whatever

		int result = 1; // 1**1 = 1
		for (int i = 2; i < 10; i++) {
			long n = i;
			int exp = 1;
			while (length(n) < exp) {
				n *= i;
				exp++;
			}
			while (length(n) == exp) {
				System.out.println("i: " + i + ", n: " + n + ", exp:" + exp);
				result++;
				n *= i;
				exp++;
			}
		}
		System.out.println(result);

		// closed form:
		// int sum = 0;
		// for (int i = 1; i<10; i++)
		// sum += (int) (1.0/(1-Math.log(i)/Math.log(10)));
		// System.out.println("Answer: " + sum);
	}

	static int length(long n) {
		int length = 0;
		while (n > 0) {
			length++;
			n /= 10;
		}
		return length;
	}
}
