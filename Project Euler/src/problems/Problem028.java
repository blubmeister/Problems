package problems;

public class Problem028 {

	static final int N = 1001;

	public static void main(String[] args) {

		int result = 1;
		int n = 1;

		for (int i = 2; i < N; i += 2) {
			for (int j = 0; j < 4; j++) {
				n += i;
				result += n;
			}

		}
		System.out.println(result);
	}
}
