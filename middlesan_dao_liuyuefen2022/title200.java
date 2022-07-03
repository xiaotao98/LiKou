package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 岛屿数量
 * <p>
 * 思路：遍历二维数组   找到一个1时   让count+1  然后就让他周围挨着的所有点都变为0  淹没岛屿（DFS）  然后再继续遍历
 */
public class title200 {
    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';//淹没岛屿
        dfs(grid, x - 1, y);
        dfs(grid, x + 1, y);
        dfs(grid, x, y - 1);
        dfs(grid, x, y + 1);
    }
}
