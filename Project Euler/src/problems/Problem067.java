package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem067 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(Problem067.class.getClassLoader().getResourceAsStream("data/Problem067.txt")));
		String line;
		ArrayList<int[]> valueList = new ArrayList<>();
		while ((line = br.readLine()) != null) {
			String[] strings = line.split(" ");
			int[] values = new int[strings.length];
			for (int i = 0; i < values.length; i++) {
				values[i] = Integer.valueOf(strings[i]);
			}
			valueList.add(values);
		}
		int[][] values = valueList.toArray(new int[valueList.size()][]);
		for (int x = values.length - 1; x > 0; x--) {
			for (int y = 0; y < values[x].length - 1; y++) {
				values[x - 1][y] += Math.max(values[x][y], values[x][y + 1]);
			}
		}
		System.out.println(values[0][0]);
	}
}