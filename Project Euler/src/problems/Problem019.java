package problems;

public class Problem019 {

	public static void main(String[] args) {

		int[] length = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 1.1.1901 = tuesday
		int day = 2;
		int result = 0;
		for (int year = 1901; year <= 2000; year++) {
			for (int month = 1; month <= 12; month++) {
				if (day % 7 == 0)
					result++;
				day = day + length[month];
				if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0)
					day++;
			}
		}
		System.out.println(result);
	}
}
