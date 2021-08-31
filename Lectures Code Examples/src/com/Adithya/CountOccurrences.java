package com.Adithya;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = input.nextInt();
        System.out.println();
        System.out.print("Enter the number you want to count: ");
        int number = input.nextInt();
        int count = 0;
        while (n>0) {
            int k = n%10;
            if (k==number) {
                count +=1;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}
