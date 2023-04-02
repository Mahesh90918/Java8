package com.threadExample;

public class MythreadNormal {
	public static void main(String[] args) {

		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {

					System.out.println("I am run Metod " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};

		Thread t = new Thread(r);
		t.start();
	}
}