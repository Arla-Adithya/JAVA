package com.Adithya;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void InsertionSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }

            }

        }
    }
    static void SelectionSort(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            int last = arr.length-i-1;
            int maxIndex = maxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }
    }
    static void bubbleSort(int[] arr) {
        for (int i=0; i<arr.length; i++ ) {
            boolean swaped = false;
            for (int j =1; j<arr.length-i;j++) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            if(!swaped) {
                break;
            }
        }
    }

    static int maxIndex(int[] arr, int start, int end) {
        int max= start;
        for (int i = start; i <=end ; i++) {

            if (arr[max]<arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
