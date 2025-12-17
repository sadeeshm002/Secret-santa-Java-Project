package com.demo.learning.plmxml;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test2 implements TestInterface,TestInterface2 {
	static int a=5;
	//static method can't access non static variable or method directly
	void getOther(){
		
		System.out.println(a);
	}

	
	static String getName(){
		
		return null;
		
	}

	public static void main(String[] args) {
		System.out.println(getName());
		Test2 obj = new Test2();
		obj.run();
		obj.runnable();
		Map<String, String> map = new HashMap<>();
		for(Entry<String, String> val : map.entrySet()) {
			
		}
		
		int arr[] = new int [5];
		
		int arr1[] = {0,1,2,3,4};
		
	
		
		
		
		
	}

	@Override
	public void run() {
		System.out.println("hello run");
		
	}


	@Override
	public void other() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void runnable() {
		// TODO Auto-generated method stub
//		TestInterface.super.runnable();
	}

}
