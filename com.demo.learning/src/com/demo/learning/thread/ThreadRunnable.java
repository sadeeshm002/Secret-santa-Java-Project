package com.demo.learning.thread;

import java.util.HashMap;
import java.util.Map;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {

		System.out.println("Runnable Thread");
	}
	
	public static void main(String[] args) {
//		ThreadRunnable runnable = new ThreadRunnable();
//		Thread t1 = new Thread(runnable);
//		t1.start();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("val1", "str1");
		map.put("val2", "str2");
		
		System.out.println(map.toString());
				
	}

}
