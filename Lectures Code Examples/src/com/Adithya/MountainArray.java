package com.Adithya;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,1};
        int target = 2;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
        int peak = PeakofArray(arr);
        int firsttry = BinarySearch(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        }
        return BinarySearch(arr, target, peak+1, arr.length-1);
    }
    static int PeakofArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]) {
                end = mid;
            } else  {
                start = mid+1;
            }
        }
        return start;
    }
    static int BinarySearch (int[] arr, int target,int start, int end) {

        boolean asc = arr[start]<arr[end];
        if (asc) {
            while (start<=end) {
                int mid = start + (end-start)/2;
                if (target>arr[mid]) {
                    start = mid+1;
                }
                else if (target<arr[mid]) {
                    end = mid-1;
                }
                else {
                    return mid;
                }
            }
        }
        else {
            while(start>=end) {
                int mid = start + (end-start)/2;
                if (target>arr[mid]) {
                    end = mid-1;
                }
                else if (target<arr[mid]) {
                    start = mid+1;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }

}
