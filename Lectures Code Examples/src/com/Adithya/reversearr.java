package com.Adithya;

import java.util.Arrays;

public class reversearr {
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int a = 0;
        int b= arr.length-1;
        while (a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a = a+1;
            b = b-1;
        }
    }
}
