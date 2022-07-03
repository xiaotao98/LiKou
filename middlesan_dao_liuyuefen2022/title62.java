package com.LiKou.middle.middlesan_dao_liuyuefen2022;

public class title62 {
    public static void main(String[] args) {
        int i = uniquePaths(3, 2);
        System.out.println(i);
    }

    /**
     * 方法一：运用动态规划的思想，矩阵没有加边
     */
    public static int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j - 1 >= 0 && i - 1 >= 0) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];//矩阵内部的点就是上面加左面
                } else {
                    if (j - 1 < 0 && i - 1 >= 0) {
                        dp[i][j] = 0 + dp[i - 1][j];//上方为0
                    } else if (j - 1 >= 0 && i - 1 < 0) {
                        dp[i][j] = 0 + dp[i][j - 1];//左边为0
                    } else {
                        dp[i][j] = 1;//原点为1
                    }
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    /**
     * 方法2：运用动态规划的思想，矩阵加边
     */
    public static int uniquePaths2(int m, int n) {
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (i == 1 && j == 1) {
                    dp[i][j] = 1;//(1,1)是起点  设置为1
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];//矩阵内部的点就是上面加左面
                }
            }
        }
        return dp[m][n];
    }
}
