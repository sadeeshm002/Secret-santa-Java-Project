package com.demo.learning.thread;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {
		
		System.out.println(LocalDateTime.now());
		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 1; i <= 12; i++) {
			Runnable task = new Task(i);
			executor.submit(task);
		}

		executor.shutdown();
		
		System.out.println(LocalDateTime.now());
	}

}

class Task implements Runnable {

	private int id;

	public Task(int id) {
		this.id = id;
	}

	@Override
	public void run() {

		System.out.println("Task " + id + " is running " + Thread.currentThread().getName());
	}

}