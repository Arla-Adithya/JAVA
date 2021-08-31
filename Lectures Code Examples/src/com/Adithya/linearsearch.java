package com.Adithya;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        linear(arr, n );
    }
    static void linear(int[]arr, int n) {
        if (arr.length==0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
                System.out.println("The number is found at index: " + i );
                return;
            }
        }
        System.out.println("Number not found");

        }
    }

