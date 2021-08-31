package com.Adithya;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        for (int count = 2; count <= n ; count++) {
            int temp = b;
            b = a+b;
            a = temp;

        }
        System.out.println(b);
    }
}
