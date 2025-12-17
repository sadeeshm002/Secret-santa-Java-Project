package com.demo.learning.plmxml;

public interface TestInterface2 {
	
	void run();
	
	default void runnable() {
		System.out.println("hello runable 2");
	}
	
	void other();

}
