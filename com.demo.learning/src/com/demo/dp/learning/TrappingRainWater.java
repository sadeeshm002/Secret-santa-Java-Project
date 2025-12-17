package com.demo.dp.learning;

import java.util.Arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }; // [0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]  [3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1]

		int n = height.length;
        int arrLeft[] = new int[n];
        int arrRight[] = new int[n];
        arrLeft[0] = height[0];
        arrRight[n-1] = height[n-1];

        for (int i = 1; i < n; i++) {
            arrLeft[i] = Math.max(height[i], arrLeft[i - 1]);
        }

        for(int i=n-2;i>=0;i--){
            arrRight[i] = Math.max(height[i], arrRight[i +1]);
        }

        int count=0;

        for(int i=0;i<n;i++){
           count +=Math.min(arrRight[i],arrLeft[i])-height[i];
        }

        System.out.println(count);

//		int n = arr.length, max = Integer.MIN_VALUE, result = 0;
//		int right[] = new int[n];
//		int left[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			max = Math.max(max, arr[i]);
//			left[i] = max;
//		}
//
//		max = Integer.MIN_VALUE;
//
//		for (int i = n - 1; i >= 0; i--) {
//			max = Math.max(max, arr[i]);
//			right[i] = max;
//		}
//
//		for (int i = 0; i < n; i++) {
//			result += Math.min(left[i], right[i]) - arr[i];
//		}
//
//		System.out.println(result);
	}

}
