package com.Adithya;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Alphabet: ");
        char ch = input.next().trim().charAt(0);
        if ('a'<=ch && 'z'>=ch){
            System.out.println("Lower");
        }else {
            System.out.println("upper");
        }

    }
}
