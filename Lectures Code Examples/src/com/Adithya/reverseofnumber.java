package com.Adithya;

import java.util.Scanner;

public class reverseofnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = input.nextInt();
        int p = 0;
        while (n>0) {
            int k = n%10;
            p = (p*10) + k;
            n = n/10;
        }
        System.out.println(p);
    }
}

