package com.Adithya;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(Arrays.toString(search(arr, 8)));
    }
    static int[] binarysearch(int[][] matrix, int row, int cstart, int cend, int target) {
        while(cstart<=cend) {
            int mid = cstart + (cend-cstart)/2;
            if (target == matrix[row][mid]) {
                return new int[]{row, mid};
            }
            if (target < matrix[row][mid]) {
                cend = mid-1;
            }
            else {
                cstart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int column = matrix[0].length;
        if (column == 0) {
            return new int[]{-1, -1};
        }
        if (rows == 1) {
            return binarysearch(matrix,0,0,column-1,target);
        }
        int rStart = 0;
        int rEnd = matrix.length-1;
        int cMid = column/2;
        while (rStart < (rEnd-1)) {
            int mid = rStart + (rEnd - rStart) /2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (target < matrix[mid][cMid]) {
                rEnd = mid;
            }
            else {
                rStart = mid;
            }
        }
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart+1][cMid] == target) {
            return new int[]{rStart+1, cMid};
        }
        if (target <= matrix[rStart][cMid-1]) {
            return binarysearch(matrix,rStart,0,cMid-1,target);
        }
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][column-1]) {
            return binarysearch(matrix, rStart, cMid+1, column-1, target);
        }
        if (target <= matrix[rStart+1][cMid-1]) {
            return binarysearch(matrix, rStart+1, 0, cMid-1, target);
        }
        else {
            return binarysearch(matrix, rStart+1, cMid+1, column-1, target);
        }

    }
}
