package com.Adithya;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,24,45,85,689};
        int[] arr2 = {98,82,78,65,55,45,32,27,18,9,8,7,6,5,4,3,2,1};
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = bsearch(arr2,num);
        System.out.println(ans);

    }
    static int bsearch(int[] arr, int n) {
        int start = 0;
        int end = arr.length-1;

        boolean ascod = arr[0] > arr[arr.length-1];
        if (ascod) {
            while (start <= end) {
                int mid = (start)+ (end-start)/2;

                if (arr[mid]<n) {

                    end = mid-1;

                }
                else if (arr[mid]>n) {

                    start = mid+1;
                }
                else {
                    return mid;
                }

            }
        }
        else {
            while (start <= end) {
                int mid = (start)+ (end-start)/2;

                if (arr[mid]>n) {

                    end = mid-1;

                }
                else if (arr[mid]<n) {

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
