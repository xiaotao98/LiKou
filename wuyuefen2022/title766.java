package com.LiKou.simple.wuyuefen2022;

/**
 * 托普利茨矩阵   如果矩阵上每一条由左上到右下的对角线上的元素都相同
 * <p>
 * 思路：只需要判断第一行元素（不包含最后一个）以及第一列元素（不包含最后一个）即可
 */
public class title766 {
    public static void main(String[] args) {

    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        for (int i = 0; i < y - 1; i++) {// 比较的是第一行元素,最后一个不比
            int a = 0;
            int b = i;
            int head = matrix[a][b];
            while (a < x - 1 && b < y - 1) {
                a++;
                b++;
                if (matrix[a][b] != head) {
                    return false;
                }
            }
        }
        for (int i = 1; i < x - 1; i++) {// 比较的是第一列元素,最后一个不比
            int a = i;
            int b = 0;
            int head = matrix[a][b];
            while (a < x - 1 && b < y - 1) {
                a++;
                b++;
                if (matrix[a][b] != head) {
                    return false;
                }
            }
        }
        return true;
    }
}
