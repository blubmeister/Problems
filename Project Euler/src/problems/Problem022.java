package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import util.Timer;

public class Problem022 {

	public static void main(String[] args) throws IOException {
		Timer.start();
		BufferedReader br = new BufferedReader(new InputStreamReader(Problem022.class.getClassLoader().getResourceAsStream("data/Problem022.txt")));
		String line = br.readLine();
		line = line.replaceAll("\"", "");
		String[] names = line.split(",");
		Arrays.sort(names);
		long result = 0;
		for (int i = 0; i < names.length; i++) {
			long sum = 0;
			for (int j = 0; j < names[i].length(); j++) {
				sum += names[i].charAt(j) - 'A' + 1;
			}
			result += sum * (i + 1);
		}
		Timer.time();
		System.out.println(result);
	}
}
