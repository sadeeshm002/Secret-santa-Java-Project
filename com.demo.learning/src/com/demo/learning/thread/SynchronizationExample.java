package com.demo.learning.thread;

public class SynchronizationExample {

	public synchronized void printVal(int val) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i * val);

//			try {
//				Thread.sleep(400);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}

	public static void main(String[] args) {
		SynchronizationExample obj = new SynchronizationExample();

//		ThreadSync t1 = new ThreadSync(obj);
//		ThreadSync2 t2 = new ThreadSync2(obj);
//
//		t1.start();
//		t2.start();
	}

}

class ThreadSync extends Thread {

	syncronizationEx2 sync;

	public ThreadSync(syncronizationEx2 sync) {
		this.sync = sync;
	}

	@Override
	public void run() {
		sync.printVal(5);
	}

//	SynchronizationExample sync;
//
//	public ThreadSync(SynchronizationExample sync) {
//		this.sync = sync;
//	}
//
//	@Override
//	public void run() {
//		sync.printVal(5);
//	}
}

class ThreadSync2 extends Thread {

	syncronizationEx2 sync;

	public ThreadSync2(syncronizationEx2 sync) {
		this.sync = sync;
	}

	@Override
	public void run() {
		sync.printVal(100);

	}

//	SynchronizationExample sync;
//
//	public ThreadSync2(SynchronizationExample sync) {
//		this.sync = sync;
//	}
//
//	@Override
//	public void run() {
//		sync.printVal(100);
//	}
}