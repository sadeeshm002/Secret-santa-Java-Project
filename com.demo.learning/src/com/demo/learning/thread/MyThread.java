package com.demo.learning.thread;

import java.util.function.BiPredicate;

public class MyThread extends Thread {

	private String name ;
	public MyThread(String name) {
		this.name = name;
	}
	
	public void run() {

//		System.out.println("Thread Excecution "+ name);
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(name + " finished.");   
	}
	
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("Thread1");
//		MyThread thread2 = new MyThread("Thread2");
//		MyThread thread3 = new MyThread("Thread3");
//		
		thread1.start();
		
//		thread2.start();
//		thread3.start();
//		
		try {
			thread1.join();
//			thread2.join();
//			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main finish");
		thread1.start();
		
//		System.out.println("Thread start");
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("Thread End");
		
//		Thread thread = new Thread(()->{
//			System.out.println("Thread sleep start");
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//			System.out.println("intrepting");
//			}
//			
//		});
//		
//		thread.start();
//		
//		try {
//			System.out.println("Thread start");
//			Thread.sleep(2000);
//			thread.interrupt();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
//		String val ="ET+829;";
//		String check ="ET";
//		
//		 BiPredicate<String, String> contains = (actualValue, checkerValue) -> actualValue.toLowerCase()
//			        .contains(checkerValue.toLowerCase());
//		System.out.println(contains.test(val, check)); 
		
		
//		if(val.toLowerCase().contains(check.toLowerCase())){
//			System.out.println("val print");
//		}
//		else {
//			System.out.println(val.toLowerCase());
//		}
	}
	
}
