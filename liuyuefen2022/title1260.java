package com.LiKou.simple.liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 二维网格迁移
 *
 * 思路：每移动一次  想当于  最后一列向下移动一格  然后将最后一列赋值给第一列  其他的列像右移动一格
 */
public class title1260 {

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int x = grid.length;
        int y = grid[0].length;
        for (int i = 0; i < k; i++) {
            int temp[][] = new int[x][1];
            for (int j = 0; j < x; j++) {//移动最后一列
                temp[j][0] = grid[(x-1 + j) % x][y - 1];
            }
            for (int m = y - 1; m > 0; m--) {//移动其他列  右移一次
                for (int n = 0; n < x; n++) {
                    grid[n][m] = grid[n][m - 1];
                }
            }
            for (int i1 = 0; i1 < x; i1++) {//将向下移动后的最后一列  复制到第一列
                grid[i1][0] = temp[i1][0];
            }
        }
        for (int i = 0; i < x; i++) {
            int[] arr = grid[i];
            List<Integer> temp = new ArrayList<>();
            for (int num : arr) {
                temp.add(num);
            }
            list.add(temp);
        }
        return list;
    }

}
