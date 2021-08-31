package com.Adithya;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter A Number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = 1;
        for(int k=1; k<=n; k++) {
            p = p * k;
        }
        System.out.println(p);
    }
}
