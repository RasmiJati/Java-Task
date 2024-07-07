/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rasmijati.MaximumSumIncreasingSubsequence;

import java.util.List;

/**
 *
 * @author admin
 */
public class Result {

    int maxSum;
    List<Integer> subsequence;

    public Result() {
    }

    public Result(int maxSum, List<Integer> subsequence) {
        this.maxSum = maxSum;
        this.subsequence = subsequence;
    }
}
