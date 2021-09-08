package com.Adithya;
//https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length) {
            int correct = nums[i] - 1;
            if(nums[i]>0 && nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j<nums.length; j++) {
            if (nums[j]>=0 && nums[j] != j+1) {
                return j+1;
            }
        }
        return nums.length+1;
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
