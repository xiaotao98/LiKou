package com.LiKou.simple.liuyuefen2022;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 距离顺序排列矩阵单元格
 * <p>
 * 思路：首先将所有的单元格存到一个二维矩阵当中，然后对二维矩阵按距离进行排序
 */
public class title1030 {

    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] rst = new int[rows * cols][2];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rst[k] = new int[]{i, j};
                k++;
            }
        }
        Arrays.sort(rst, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Math.abs(o1[0] - rCenter) + Math.abs(o1[1] - cCenter) - (Math.abs(o2[0] - rCenter) + Math.abs(o2[1] - cCenter));
            }
        });
        return rst;
    }

}
