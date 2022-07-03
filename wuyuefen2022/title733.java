package com.LiKou.simple.wuyuefen2022;

/**
 * 图像渲染
 *
 * 深度遍历的思想
 */
public class title733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        dfs(image, sr, sc, newColor, oldColor);
        return image;
    }

    public void dfs(int[][] image, int x, int y, int newColor,int oldColor){
        if (x < 0 || x >=image.length || y < 0 || y >=image[0].length) {// 坐标不符合要求
            return;
        }
        if (image[x][y] != oldColor || image[x][y] == newColor) {
            return;
        }
        image[x][y] = newColor;
        dfs(image, x - 1, y, newColor, oldColor);
        dfs(image, x + 1, y, newColor, oldColor);
        dfs(image, x, y - 1, newColor, oldColor);
        dfs(image, x, y + 1, newColor, oldColor);
    }
}
