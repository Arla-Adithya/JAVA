package com.Adithya;

import java.util.Arrays;
// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(RunningSum(nums)));
    }
    static int[] RunningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
