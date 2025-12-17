package com.demo.learning.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

	public static void main(String[] args) {
		AnotherThread thread = new AnotherThread();
		thread.start();

		AnotherThread2 th = new AnotherThread2();
		Thread thread2 = new Thread(th);
		thread2.start();

		ExecutorService ex = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 5; i++) {
			Runnable task = new AnotherThread2();
			ex.submit(task);
		}

		ex.shutdown();
	}

}

class AnotherThread extends Thread {
	@Override
	public void run() {
		System.out.println("sample Thread");
	}
}

class AnotherThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Another th");

	}
}
