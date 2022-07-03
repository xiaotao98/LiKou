package com.LiKou.simple.wuyuefen2022;

/**
 * 转置矩阵
 * <p>
 * 思路：arr_new[i][j]=arr_old[j][i] 即可
 */
public class title867 {
    public static int[][] transpose(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        int[][] arr = new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }
}
