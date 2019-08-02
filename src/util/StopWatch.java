package util;

public class StopWatch {
	private static long startTime = 0;
	public static void play() {
		StopWatch.startTime = System.currentTimeMillis();
	}
	public static void stop() {
		System.out.println("속도 : " + (System.currentTimeMillis() - StopWatch.startTime));
	}
}
