package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

import util.Timer;

public class Problem082 {

	static final int N = 80;
	static int[][] distance = new int[N][N];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(Problem082.class.getClassLoader().getResourceAsStream("data/Problem082.txt")));
		String line;
		int[][] matrix = new int[N][N];
		for (int x = 0; x < N; x++) {
			Arrays.fill(distance[x], 999999);
		}
		boolean[][] visited = new boolean[N][N];
		int i = 0;
		while ((line = br.readLine()) != null) {
			String[] values = line.split(",");
			for (int y = 0; y < N; y++) {
				matrix[i][y] = Integer.parseInt(values[y]);
			}
			i++;
		}
		Timer.start();
		PriorityQueue<Node> queue = new PriorityQueue<>();
		for (int x = 0; x < N; x++) {
			distance[x][0] = matrix[x][0];
			queue.add(new Node(x, 0));
		}
		Node node = queue.poll();
		while (node != null) {
			int x = node.x;
			int y = node.y;
			if (!visited[x][y]) {
				if (x + 1 < N && !visited[x + 1][y]) {
					distance[x + 1][y] = Math.min(distance[x][y] + matrix[x + 1][y], distance[x + 1][y]);
					Node newNode = new Node(x + 1, y);
					queue.add(newNode);
				}
				if (y + 1 < N && !visited[x][y + 1]) {
					distance[x][y + 1] = Math.min(distance[x][y] + matrix[x][y + 1], distance[x][y + 1]);
					Node newNode = new Node(x, y + 1);
					queue.add(newNode);
				}
				if (x - 1 >= 0 && !visited[x - 1][y]) {
					distance[x - 1][y] = Math.min(distance[x][y] + matrix[x - 1][y], distance[x - 1][y]);
					Node newNode = new Node(x - 1, y);
					queue.add(newNode);
				}
				visited[x][y] = true;
			}
			node = queue.poll();
		}
		int result = 999999;
		for (int x = 0; x < N; x++) {
			if (distance[x][N - 1] < result)
				result = distance[x][N - 1];
		}
		Timer.time();
		System.out.println(result);
	}

	static class Node implements Comparable<Node> {
		int x;
		int y;

		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Node node) {
			return distance[x][y] - distance[node.x][node.y];
		}

		@Override
		public boolean equals(Object node) {
			if (this == node)
				return true;
			return (x == ((Node) node).x && y == ((Node) node).y);
		}
	}
}
