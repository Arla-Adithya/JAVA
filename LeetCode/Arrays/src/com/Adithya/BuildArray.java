package com.Adithya;

import java.sql.Array;
import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/
public class BuildArray {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(BuildArray(nums)));
    }
    static int[] BuildArray(int[] nums) {
            int[] arr = new int [nums.length];
            for (int i = 0; i < nums.length; i++) {
                arr[i] = nums[nums[i]];
            }
            return arr;
    }
}
