package com.Adithya;

public class SplitArray {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i <nums.length ; i++) {
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        while(start<end) {
            int mid = start +  (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum+num>mid) {
                    sum = num;
                    pieces+=1;
                }else {
                    sum = sum+num;
                }
            }
            if (pieces<=m) {
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
