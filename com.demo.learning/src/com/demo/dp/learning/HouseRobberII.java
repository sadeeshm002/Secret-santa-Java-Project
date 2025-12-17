package com.demo.dp.learning;

public class HouseRobberII {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 2 };
		int n = arr.length;

		System.out.println(Math.max(robLinear(arr, 0, n - 2), robLinear(arr, 1, n - 1)));
	}

	private static int robLinear(int[] arr, int start, int end) {
		int prev2 = 0;
		int prev1 = arr[start];
		
		for(int i= start+1;i<=end;i++) {
			int curr = Math.max(prev1,prev2+arr[i]);
			prev2 = prev1;
			prev1=curr;
		}
		
		return prev1;
	}

}
