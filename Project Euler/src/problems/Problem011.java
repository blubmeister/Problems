package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem011 {

	static final int N = 4;

	public static void main(String[] args) {

		int result = 0;
		int currentHorizontal, currentVertical, currentDiagonal, currentAntiDiagonal;
		int[][] values = readInput();
		for (int x = N - 1; x < values.length; x++) {
			for (int y = N - 1; y < values.length; y++) {
				currentHorizontal = values[x][y];
				currentVertical = values[x][y];
				currentDiagonal = values[x][y];
				currentAntiDiagonal = values[values.length - x - 1][y];
				for (int i = 1; i < N; i++) {
					currentHorizontal *= values[x - i][y];
					currentVertical *= values[x][y - i];
					currentDiagonal *= values[x - i][y - i];
					currentAntiDiagonal *= values[values.length - x + i - 1][y - i];
				}
				if (currentHorizontal > result)
					result = currentHorizontal;
				if (currentVertical > result)
					result = currentVertical;
				if (currentDiagonal > result)
					result = currentDiagonal;
				if (currentAntiDiagonal > result)
					result = currentAntiDiagonal;
			}
		}
		System.out.println(result);
	}

	static int[][] readInput() {
		InputStream is = Problem011.class.getClassLoader().getResourceAsStream("data/Problem011.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		try {
			ArrayList<int[]> temp = new ArrayList<>();
			while ((line = br.readLine()) != null) {
				String[] strings = line.split(" ");
				int[] values = new int[strings.length];
				for (int i = 0; i < strings.length; i++) {
					values[i] = Integer.valueOf(strings[i]);
				}
				temp.add(values);
			}
			return temp.toArray(new int[temp.size()][]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
