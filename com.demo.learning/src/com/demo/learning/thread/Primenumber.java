package com.demo.learning.thread;

public class Primenumber {

	public static void main(String[] args) {
		int n = 27;

		int sqrt = (int) Math.sqrt(n);
		System.out.println(sqrt);

		if (isPrime(n)) {
			System.out.println("Prime ");
		} else {
			System.out.println("not a prime");
		}

	}

	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else if (n == 2 || n == 3) {
			return true;
		} else if (n % 2 == 0) {
			return false;
		} else {
			for (int i = 5; i <= n; i += 2) {
				if (n % i == 0) {

					return false;
				}
			}

			return true;
		}
	}

}
