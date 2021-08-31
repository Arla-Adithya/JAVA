package com.Adithya;

public class SearchInrotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 6;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
      int pivot = findpivotwithmulti(arr);
      if (pivot == -1) {
          return bs(arr,target,0,arr.length-1);
      }
      if(arr[pivot]==target) {
          return pivot;
      }if (target>= arr[0]) {
          return bs(arr,target,0,pivot-1);
        }
      return bs(arr,target,pivot+1, arr.length-1);
    }
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
    static int bs(int[] arr, int target, int start, int end) {
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target>arr[mid]) {
                start = mid+1;
            }
            else if (target<arr[mid]) {
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
