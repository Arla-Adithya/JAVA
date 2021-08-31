package com.Adithya;

public class FirstAndLastIndex {
    int[] searchRange(int[] nums, int target) {
        int[] req = {-1, -1};
        int k = search(nums, target, true);
        int q = search(nums, target, false);
        req[0] = k;
        req[1] = q;
        return req;
    }
    int search(int[] nums, int target, boolean firststartindex) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end) {
            int mid = start + (end - start) /2 ;
            if(target<nums[mid]) {
                end = mid - 1;
            }
            else if (target>nums[mid]) {
                start = mid +1;
            }
            else {
                ans = mid;
                if (firststartindex) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
