package com.Adithya;

public class RotationCount {
    public static void main(String[] args) {
        int [] arr = {6,7,8,9,1,2,3,4,5};
        int ans = CountRotations(arr);
        System.out.println(ans);
    }
    static int CountRotations(int[] arr) {
        int pivot = findpivot(arr);
        return pivot + 1;
    }
    // use this for non-duplicates;
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (mid< end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            else if (arr[start]>=arr[mid]) {
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    // use this for duplicates.
    static int findpivotwithmulti(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start>=end) {
            int mid = start + (end - start) / 2;
            if (mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if (start == mid && mid == end ) {
                if (arr[start]>arr[start+1]) {
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]) {
                    return end-1;
                }
                end--;
            }else if (arr[start]<arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end]) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
