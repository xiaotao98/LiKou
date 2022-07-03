package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 旋转图像
 *
 * 思路：1 顺时针转90度  先转置 再左右镜像  2 顺时针转180度  先上下镜像 再左右镜像    3 顺时针转270度  先转置 再上下镜像
 */
public class title48 {
    public static void rotate(int[][] matrix) {
        //先转置，然后再镜像翻转
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = matrix[i];
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = arr[j];
                arr[j] = arr[arr.length - j - 1];
                arr[arr.length - j - 1] = temp;
            }
        }
    }
}
