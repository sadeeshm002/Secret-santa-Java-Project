package com.demo.dp.learning;

public class LISReconstruction {
    public static void main(String[] args) {
        int arr[] = {50, 3, 10, 7, 40, 80};
        int n = arr.length;

        int[] dp = new int[n];       // dp[i] = length of LIS ending at i
        int[] parent = new int[n];   // to reconstruct path

        int maxLen = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;          // every element is LIS of length 1
            parent[i] = -1;     // initially no parent

            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;  // point back to the element used
                }
            }

            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIndex = i;
            }
        }

        // Reconstruct LIS using parent[]
        int[] lis = new int[maxLen];
        int k = maxLen - 1;
        int index = maxIndex;

        while (index != -1) {
            lis[k--] = arr[index];
            index = parent[index];
        }

        // Print LIS
        System.out.print("LIS: ");
        for (int x : lis) {
            System.out.print(x + " ");
        }
    }
}

