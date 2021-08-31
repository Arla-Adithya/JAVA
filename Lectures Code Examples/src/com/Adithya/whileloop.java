package com.Adithya;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            sum = sum + a;
            if(a==0) {
                System.out.println(sum);
                return;
            }
        }
    }
}
