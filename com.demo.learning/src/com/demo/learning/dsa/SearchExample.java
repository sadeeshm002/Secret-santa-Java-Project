package com.demo.learning.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Optional;
import java.util.stream.Collectors;

public class SearchExample {
	
	public static void main(String[] args) {
//		String val ="sadeesh";		
//		int index = findIndex(val,'e');
		
//		int[] arr = {4,5,3,6,9};
//		int index = findArrIndex(arr,8);
		
//		int[][] arr = {{1,2,4},{6,5,13,7,8},{9,11,15}};
//		
//		int[] outArr = findTwoDimentionalIndex(arr,7);
//		System.out.println(Arrays.toString(outArr));
//		
//		System.out.println(arr[2].length);
		
//		 int[] arr = {1,3,4,7,12,20,21,25,31,42};
		
		int[] arr = {0,0,3,0,1,1,1,1,1,1};
		
		

		
		int[] array = Arrays.stream(arr).boxed().sorted((a,b) -> b - a).mapToInt(Integer::intValue).toArray();
		
	
		
	
	
//		int index = findFirstOne(arr);
	        
//	       int index = findElementByBinarySearch(arr,25);
	       System.out.println(Arrays.toString(array));
	}

	
	private static int findFirstOne(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int index=-1;
		while(start<=end) {
			int mid = (start + end) /2;
			if(arr[mid]==1) {
				end =mid-1;
				index=mid;
			}
			else if(arr[mid]!=1) {
				start = mid+1;
			}
		}
		return index;
	}


	public static int findElementByBinarySearch(int[] arr,int target){
	        int start=0;
	        int end = arr.length-1;
	        
	        
	        while(start<=end){
	           int mid = (start + end) /2;
	            if(target == arr[mid]){
	                return mid;
	            }
	            else if(target <arr[mid]){
	                end=mid-1;
	            }
	            else if(target > arr[mid]){
	                start = mid +1;
	            }
	            
	        }
	         return -1;
	    }
	
	private static int[] findTwoDimentionalIndex(int[][] arr, int target) {

		for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        
        return new int[]{-1,-1};
	}

	private static int findArrIndex(int[] arr, int val) {

		for(int i=0;i<arr.length;i++) {
			if(val==arr[i]) {
				return i;
			}
		}
		return -1;
	}

	private static int findIndex(String val, char c) {
       for(int i=0;i<val.length();i++) {
    	   if(val.charAt(i)==c) {
    		   return i;
    	   }
       }
       return -1;
	}

}
