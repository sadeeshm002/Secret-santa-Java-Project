package com.demo.learning.plmxml;

public interface TestInterface extends TestInterface2 {
	
	void run() ;
	default void runnable() {
		System.out.println("hello runable1");
	}

}
