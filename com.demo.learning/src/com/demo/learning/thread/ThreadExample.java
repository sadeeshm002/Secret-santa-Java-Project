package com.demo.learning.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {

	public static  void main(String[] args) {

//		ExecutorService ex = Executors.newFixedThreadPool(3);
//         int count =0;
//		for (int i = 0; i < 5; i++) {
//			ThreadEx th = new ThreadEx(i);
//			ex.submit(th);
////			Thread t1 = new Thread(th);
////			t1.start();
//		}
//
//		ex.shutdown();
//		Thread1 runnable = new Thread1(1);
//		Thread th = new Thread(runnable);
//		th.start();
//		
//		System.out.println("main");
		
		ExecutorService ex = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			Thread1 runnable = new Thread1(i);
			ex.submit(runnable);
		}
		ex.shutdown();

		System.out.println("main");
	}
}

//class ThreadEx implements Runnable {
//
//	private int id;
//
//	public ThreadEx(int id) {
//		this.id = id;
//	}
//
//	@Override
//	public void run() {
//		System.out.println(this.id + " Thread started " + Thread.currentThread().getName());
//	}
//}


class Thread1 implements Runnable {
	int id;

	public Thread1(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println(id + " thread = " + Thread.currentThread().getName());
	}
}