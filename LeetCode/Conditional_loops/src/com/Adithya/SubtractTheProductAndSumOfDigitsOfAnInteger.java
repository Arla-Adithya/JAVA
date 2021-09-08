package com.Adithya;
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
import java.util.Scanner;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = productofdigits(n) - sumofdigits(n);
        System.out.println(ans);
    }
    static int productofdigits(int n) {
        int ans = 1;
        while (n>0) {
            int k = n%10;
            ans = k*ans;
            n = n/10;
        }
        return ans;
    }
    static int sumofdigits(int n) {
        int sum = 0;
        while(n>0) {
            int l = n%10;
            sum = sum+l;
            n = n/10;
        }
        return sum;
    }

}
