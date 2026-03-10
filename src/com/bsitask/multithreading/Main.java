package com.bsitask.multithreading;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main Thread");
		Thread1 thread1 = new Thread1("Thread 1");
		Thread2 thread2 = new Thread2("Thread 2");

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("From Main Thread After Waiting For Finish Thread 1 & 2");

	}

}
