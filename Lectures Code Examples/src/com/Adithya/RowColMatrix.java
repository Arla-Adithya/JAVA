package com.Adithya;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(matrix,45)));
    }
    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[1].length-1;
        while (row < matrix.length && column >=0) {
            if (matrix[row][column] == target) {
                return new int[]{row, column};
            }
            else if (target < matrix[row][column]) {
                column--;
            }
            else if (target > matrix[row][column]) {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
