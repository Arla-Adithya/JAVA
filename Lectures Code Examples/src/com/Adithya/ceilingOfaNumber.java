package com.Adithya;

public class ceilingOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,5,14,16,18,20};
        int n = 15;
        int ans = ceiling(arr,n);
        int ans2 = floor(arr, n);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int ceiling(int[] arr, int n) {
        if (n>arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end -start)/2;
            if (arr[mid] > n) {
                end = mid-1;
//                if (arr[mid-1]<n && n<=arr[mid]){
//                    return arr[mid];
//                }
            }
            else if (arr[mid]<n) {
                start = mid + 1;
//                if (arr[mid]<n && n<=arr[mid+1]){
//                        return arr[mid+1];
//                }
            }
            else {
                return arr[mid];
            }
        }return arr[start];
    }
    static int floor(int[] arr, int n) {
//        if (n<arr[0]){
//            return -1;                    not necessary because at last the value of 'end' will become -1.
//        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end -start)/2;
            if (arr[mid] > n) {
                end = mid-1;
//                if (arr[mid-1]<n && n<=arr[mid]){
//                    return arr[mid];
//                }
            }
            else if (arr[mid]<n) {
                start = mid + 1;
//                if (arr[mid]<n && n<=arr[mid+1]){
//                        return arr[mid+1];
//                }
            }
            else {
                return arr[mid];
            }
        }return arr[end];
    }
}

