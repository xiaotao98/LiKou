package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 最大正方形
 * <p>
 * 思路：动态规划问题，dp[i][j]代表以i j为右下角的边长
 */
public class title221 {

    public static void main(String[] args) {
        char[][] matrix = {{'0', '1'}, {'1', '0'}};
        int i = maximalSquare(matrix);
        System.out.println(i);
    }


    public static int maximalSquare(char[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        int max = 0;
        int dp[][] = new int[x + 1][y + 1];//dp[i][j]代表以i j为右下角的边长
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (matrix[i - 1][j - 1] == '1') {//左上角为1 来确定右下角的取值
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]);
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                    }
                }
            }
        }
        return max * max;
    }

}
