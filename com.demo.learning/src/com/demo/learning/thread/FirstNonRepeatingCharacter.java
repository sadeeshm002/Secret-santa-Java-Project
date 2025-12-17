package com.demo.learning.thread;

import java.util.Arrays;
import java.util.List;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String val = "aabe";
         val = val.toLowerCase();
		List<Character> vowelList = Arrays.asList('a','e','i','o','u'); 

		for (int i = 0; i < val.length(); i++) {
			char a = val.charAt(i);
			if(vowelList.contains(a)) {
			boolean isRepeating = false;
			
			for (int j = 0; j < val.length(); j++) {
				if (val.charAt(j) == a && i!=j) {
					isRepeating = true;
					break;
				} 
			}
			if (!isRepeating) {
				System.out.println(a);
				break;
			}
			}
		}
	}

}
