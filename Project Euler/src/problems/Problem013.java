package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem013 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(Problem013.class.getClassLoader().getResourceAsStream("data/Problem013.txt")));
		String line;
		long result = 0;
		while ((line = br.readLine()) != null) {
			result += Long.valueOf(line.substring(0, 12));
		}
		int length = 1;
		long copy = result;
		while ((copy /= 10) > 0) {
			length++;
		}
		while (length-- > 10) {
			result /= 10;
		}

		System.out.println(result);
	}
}
