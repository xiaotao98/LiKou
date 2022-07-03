package com.LiKou.simple.wuyuefen2022;

/**
 * 三维形体投影面积
 *
 * 思路：三个面之和，x=二维矩阵非零元素的个数，y=每一行最大的数之和(n行就有n个数)，z=每一列最大的数之和(n列就有n个数)
 */
public class title883 {
    public int projectionArea(int[][] grid) {
        int x = 0;//二维矩阵元素非零的个数
        int y = 0;//每一行最大的数之和
        int z = 0;//每一列最大的数之和
        int hang = grid.length;
        int lie = grid[0].length;
        int max1 = 0, max2 = 0;
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < lie; j++) {
                if (grid[i][j] != 0) {
                    x++;
                }
                if (grid[i][j] > max1) {
                    max2 = max1;
                    max1 = grid[i][j];
                }
            }
        }
        for (int i = 0; i < hang; i++) {
            int max = 0;
            int[] arr1 = grid[i];
            for (int num : arr1) {
                if (num > max) {
                    max = num;
                }
            }
            y = y + max;
        }
        //每一列最大的数之和
        for (int i = 0; i < grid[0].length; i++) {
            int lie_max = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > lie_max) {
                    lie_max = grid[j][i];
                }
            }
            z = z + lie_max;
        }
        return x + y + z;
    }
}
