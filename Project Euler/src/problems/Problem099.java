package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import util.Timer;

public class Problem099 {

	public static void main(String[] args) throws IOException {

		Timer.start();
		BufferedReader br = new BufferedReader(new InputStreamReader(Problem099.class.getClassLoader().getResourceAsStream("data/Problem099.txt")));
		int result = 0;
		double max = 0;
		for (int i = 1; i <= 1000; i++){
			String[] values = br.readLine().split(",");
			int value = Integer.parseInt(values[0]);
			double exponent = Integer.parseInt(values[1]);
			exponent *= Math.log(value);
			if (exponent > max){
				max = exponent;
				result = i;
			}
		}
		Timer.time();
		System.out.println(result);
	}
}
