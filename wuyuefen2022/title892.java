package com.LiKou.simple.wuyuefen2022;

/**
 * 三维形体的表面积
 */
public class title892 {
    /**
     * 最简单思路，先算总面积，然后上下左右去减就行
     */
    public int surfaceArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    sum = sum + grid[i][j] * 4 + 2;//总面积  每个正方形4个侧面+上下两个底面
                }
                if (i > 0) {
                    sum = sum - Math.min(grid[i - 1][j], grid[i][j]) * 2;
                }
                if (j > 0) {
                    sum = sum - Math.min(grid[i][j - 1], grid[i][j]) * 2;
                }
            }
        }
        return sum;
    }
}
