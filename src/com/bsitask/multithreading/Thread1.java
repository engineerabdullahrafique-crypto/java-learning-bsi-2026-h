package com.bsitask.multithreading;

public class Thread1 extends Thread {

	public Thread1(String threadName) {
		super(threadName);
	}

	@Override
	public void run() {
		System.out.println("From Thread 1");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " Countdown " + i);
		}
	}

}
