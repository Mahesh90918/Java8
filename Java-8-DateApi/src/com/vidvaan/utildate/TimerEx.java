package com.vidvaan.utildate;

public class TimerEx {
	private long startTime = 0;
	private long endTime = 0;

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	// record start time
	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	// record end time
	public void end() {
		this.endTime = System.currentTimeMillis();

	}

	public long getTotalTime() {
		return this.endTime - this.startTime;
	}

	public static void main(String[] args) {
		TimerEx timer = new TimerEx();
		timer.start();
		for (int i = 1; i < 10000; i++) {
			for (int j = 1; j < 1000; j++) {
				for (int k = 1; k < 1000; k++) {}
			}

		}

		timer.end();

		long totalTime = timer.getTotalTime();
		System.out.println("startTime " + timer.getStartTime() + " millisec");
		System.out.println("startTime " + timer.getEndTime() + " millisec");
		System.out.println("startTime " + totalTime + " millisec");

	}

}
