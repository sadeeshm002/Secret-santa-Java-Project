package com.demo.dp.learning;

public class PolindromeCheck {

	public static void main(String[] args) {
		String str = "madama";

		String input = "A man, a plan, a canal: Panama122";
		String cleaned = input.replaceAll("[^A-Za-z]", "").toLowerCase();

		System.out.println(cleaned);
		System.out.println(Character.isLetter('2'));

		int n = str.length();
		int left = 0, right = n - 1;
		boolean isPolindrome = true;

		while (right > left) {
			if (str.charAt(left) != str.charAt(right)) {
				isPolindrome = false;
				break;
			}
			right--;
			left++;
		}

		System.out.println(isPolindrome);

	}

}
