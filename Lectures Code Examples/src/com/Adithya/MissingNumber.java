package com.Adithya;

import java.util.Arrays;

// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
//
//
//
//Example 1:
//
//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//Example 2:
//
//Input: nums = [0,1]
//Output: 2
//Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
// Amazon interview Question.
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        int ans = MisiingNumber(arr);
        System.out.println(ans);

    }
    static int MisiingNumber(int[] arr) {
        int i = 0;
        int correct = i;
        while(i<arr.length) {
            if (arr[i]!=i && arr[i]<arr.length) {
                swap(arr,i,arr[i]);
            }
            else {
                i++;
            }
        }
        for (int j=0;j<arr.length;j++) {
            if (arr[j]!=j) {
                return j;
            }
        }
        return arr.length;

    }
    static void swap(int[] arr,int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
