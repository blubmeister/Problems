package util;

public class Timer {

	static long nanotime;

	public static void start() {
		nanotime = System.nanoTime();
	}

	public static void time() {
		System.out.println(((System.nanoTime() - nanotime) / 1000000) + "ms");
	}
}
