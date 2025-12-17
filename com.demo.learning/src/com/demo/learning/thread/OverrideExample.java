package com.demo.learning.thread;

public class OverrideExample {

	public static void main(String[] args) {
		Animal dog = new Animal() {

			@Override
			public void sleep() {
				System.out.println("sleeping");
				
			}
			
		};
//		dog.eat();
		dog.run();
		dog.sleep();
		
	}
	
	public void eat() {
		System.out.println("Dog Eating");
	}
}

abstract class  Animal  {
	
	public abstract void sleep();
	
	public void run() {
		System.out.println("Animals Running");
	}
	
}

class Dog extends Animal{
	
	public void eat() {
		System.out.println("Dog Eating");
	}
	
	@Override
	public void run() {
		System.out.println("Dog running");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
}