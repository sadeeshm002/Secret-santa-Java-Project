package com.demo.learning.dsa;

public class Fibonacci {
	
//	public static void main(String[] args) {
//		
//		int val1=0;
//		int val2=1;
//		int val3;
//		
//		for(int i=0;i<10;i++) {
//			if(i==0) {
//				System.out.print(val1);
//			}
//			else if(i==1) {
//				System.out.print(val2);
//			}
//			else {
//				val3 = val1+val2;
//				System.out.print(val3);
//				val1= val2;
//				val2= val3;
//			}
//		}
//	}
	
	
	public static int fib(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
	
	public static int findFirstOne(int[] arr) {
	    int left = 0;
	    int right = arr.length - 1;
	    int result = -1;

	    while (left <= right) {
	        int mid = left + (right - left) / 2;

	        if (arr[mid] == 1) {
	            result = mid;         // Potential answer
	            right = mid - 1;      // Try to find earlier 1
	        } else {
	            left = mid + 1;
	        }
	    }

	    return result;
	}


    public static void main(String[] args) {
//        System.out.println(fib(10)); // Output: 55
    	int arr[]= {0,0,0,0,1,1,1,1};
    	 System.out.println(findFirstOne(arr));
    	
    }

}
