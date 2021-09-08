package com.Adithya;

import java.util.Arrays;

// https://leetcode.com/problems/concatenation-of-array/
public class ConcatenationOfAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int [2*n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }
}
