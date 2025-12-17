package com.demo.learning.thread;

public class syncronizationEx2 {

	public void printVal(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i * n);
		}
	}

	public static void main(String[] args) {
		syncronizationEx2 sync = new syncronizationEx2();
		ThreadSync th = new ThreadSync(sync);
		ThreadSync2 th2 = new ThreadSync2(sync);
		th.start();
		th2.start();
	}

}
