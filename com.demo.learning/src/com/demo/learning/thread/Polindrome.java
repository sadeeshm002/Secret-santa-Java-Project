package com.demo.learning.thread;

public class Polindrome {
	
	public static void main(String[] args) {
		String val ="madam";
		Boolean isPolindrome= true;
		
		for(int i =0;i<val.length()/2;i++) {
			if(val.charAt(i)!= val.charAt(val.length()-1-i)) {
				isPolindrome =false;
				break;
			}
		}
		if(isPolindrome ) {
			System.out.println("polindrome");
		}
		else {
			System.out.println("not polindrome");
		}
		
		
	}

}
