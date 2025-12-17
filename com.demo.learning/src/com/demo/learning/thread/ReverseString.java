package com.demo.learning.thread;

import java.text.MessageFormat;

public class ReverseString {
	
	public static void main(String[] args) {
		String name = "sadeesh";
		
		String rverseString ="";
		
//		StringBuilder builder = new StringBuilder(name);
//		
//		builder.reverse();
//		
//		System.out.println(builder);
		
		for(int i=name.length()-1;i>=0;i--) {
			rverseString +=name.charAt(i);
		}
		System.out.println(rverseString);
		
		int compareTo = name.compareTo("sss");
		System.out.println(compareTo);
		String format = String.format("welecome %s,%s",name,rverseString);
		System.out.println(format);
		
		StringBuffer sb = new StringBuffer("sad");
		boolean equals = sb.equals(name);
		System.out.println(equals);
	}

}
