package com.Adithya;

public class BinarySearchForInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,8,12,25,56,78,84,95,102,156,182,192,202};
        int target = 5;
        int ans = findingrange(arr,target);
        System.out.println(ans);
    }
    static int findingrange(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end;
            end = end + (end - start + 1) * 2;
            start = temp + 1;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
