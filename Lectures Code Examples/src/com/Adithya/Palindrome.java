package com.Adithya;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(palin(str));
    }
    static boolean palin(String str) {
        if (str == null || str.length()==0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <=str.length()/2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length()-i-1);
            if (start != end) {
                return false;
            }
        }
        return true;
    }

}
