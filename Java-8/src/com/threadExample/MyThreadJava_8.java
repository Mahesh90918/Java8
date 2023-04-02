package com.threadExample;

public class MyThreadJava_8 {
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("my name is thread");
		Thread t = new Thread(r);
		t.start();
	}
}
