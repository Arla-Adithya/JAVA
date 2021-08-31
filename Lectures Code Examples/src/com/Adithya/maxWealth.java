package com.Adithya;

public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        int ans = max(accounts);
        System.out.println(ans);
    }
    static int max(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
            int sum = 0;
            for (int account = 0;account<accounts[person].length;account++ ){
                sum = sum + accounts[person][account];
            if (sum>max) {
                max = sum;
            }
            }
        }
        return max;
    }
}
