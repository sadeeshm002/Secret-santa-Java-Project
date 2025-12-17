package com.demo.learning.thread;

import java.util.ArrayList;
import java.util.List;

class TestB{
     static int add(int a,int b) {
    	 return a+b;
     }
}
 
 interface IAddble {
	 int add(int a, int b, int c);
 }

public class TestA  extends TestB{
	
  public static void main(String[] args) {
//	  short a = 9;
//	System.out.println(add(9 , 6));
	  
	  int a=2,b=3,c=4;
		IAddble add =  (d,e,f) ->{return  d+e+f;};
		System.out.println(add.add(a, b, c));
		
		
}

}
