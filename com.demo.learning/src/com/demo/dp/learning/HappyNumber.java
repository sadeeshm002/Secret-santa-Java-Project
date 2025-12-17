package com.demo.dp.learning;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static boolean isHappy(int n) {

		int sum;
		sum = n;
		Set<Integer> set = new HashSet<>();

		while (!set.contains(sum)) {
			if (sum == 1) {
				return true;
			}
			set.add(sum);
			sum = getDigitSqureSum(sum);
		}

		return false;

	}

	private static int getDigitSqureSum(int n) {
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum += (digit * digit);
			n = n / 10;
		}

		return sum;

	}

	public static void main(String[] args) {

		System.out.println(isHappy(2));
//		int n = 111;
//
//		while (n > 0) {
//			int digit = n % 10;
//			System.out.println(Math.s);
//			n = n / 10;
//		}
	}

}
