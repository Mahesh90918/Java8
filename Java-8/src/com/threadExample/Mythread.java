package com.threadExample;

public class Mythread  implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			System.out.println("I am run Metod "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		Mythread m=new Mythread();
		Thread th=new Thread(m);
		th.start();
	}

}
