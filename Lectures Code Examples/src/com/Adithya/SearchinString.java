package com.Adithya;

import java.util.Scanner;

public class SearchinString {
    public static void main(String[] args) {
        String name = "Adithya";
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        search(name, a);
    }
    static void search(String S, char a) {
        if (S.length()==0) {
            System.out.println("Invalid");
            return;
        }
//        for(char ch : S.toCharArray()) {
//            if (ch == a) {
//                System.out.println(ch);
//                return;
//            }
//        }
        for (int i = 0; i < S.length(); i++) {
            if (a == S.charAt(i)) {
                System.out.println("Character found at index: " + i);
                return;
            }
        }
        System.out.println("Character Not Found");
    }
}
