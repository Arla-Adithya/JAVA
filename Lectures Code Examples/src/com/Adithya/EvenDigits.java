package com.Adithya;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {15, 654,76,52,4};
        int a = findnumbers(nums);
        System.out.println(a);
    }
    static int findnumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int n) {
        int i = 0;
        if(n<0){
            n = n*(-1);
        }
        while (n>0){
            i++;
            n = n/10;
        }
        if (i%2==0){
            return true;
        }return false;
    }
    static int digitd2(int nums) {
        if (nums < 0) {
            nums = nums * -1;
        }
        return (int)(Math.log10(nums)) + 1;
    }
}
