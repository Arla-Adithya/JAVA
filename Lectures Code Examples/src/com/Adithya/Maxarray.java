package com.Adithya;

import java.util.Scanner;

public class Maxarray{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
         }
        int a = arr[0];
        for (int j : arr) {
            if (j > a) {
                a = j;
            }

        }
        System.out.println(a);
    }
        }
