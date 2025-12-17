package com.demo.learning.thread;

import java.util.Scanner;

public class CountZeroOnNumber {
	
	public static int countZero(int number) {
		int count =0;
	    for(int i=1;i<=number;i++) {
	    	int num = i;
	    	while(num>0) {
	    	if(num%10==0) {
	    		count++;
	    	}
	    	num /= 10;
	    	}
	    }
		
		return count;
	}
	
	public static void main(String[] arr) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int output = countZero(num);
		
		System.out.println(output);
	}

}
