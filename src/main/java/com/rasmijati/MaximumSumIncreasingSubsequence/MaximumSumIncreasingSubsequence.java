/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rasmijati.MaximumSumIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class MaximumSumIncreasingSubsequence {

    public static void main(String[] args) {
        int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11};

        Result result;

        result = maxSumIncreasingSubsequence(arr);

        System.out.println("Maximum Sum: " + result.maxSum);
        System.out.print("Increasing Subsequence: ");
        for (int num : result.subsequence) {
            System.out.print(num + " ");
        }
    }

    public static Result maxSumIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
            sequence[i] = i;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + arr[i]) {
                    dp[i] = dp[j] + arr[i];
                    sequence[i] = j;
                }
            }
        }

        int maxSum = dp[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (dp[i] > maxSum) {
                maxSum = dp[i];
                maxIndex = i;
            }
        }

        List<Integer> subsequence = new ArrayList<>();
        while (sequence[maxIndex] != maxIndex) {
            subsequence.add(0, arr[maxIndex]);
            maxIndex = sequence[maxIndex];
        }
        subsequence.add(0, arr[maxIndex]);

        return new Result(maxSum, subsequence);
    }
}
