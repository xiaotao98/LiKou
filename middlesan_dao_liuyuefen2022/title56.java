package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 合并区间
 * <p>
 * 思路：首先将二维数组按照第一列数字大小排序，然后用下标为0的作为基准，从二维数组下标为1开始遍历。
 * 判断基准是否能和此次的合并区间，如果能，则将他们合并，并且将合并之后的作为新的基准。如果不能，则将基准区间加入到list中，然后将基准区间变更为此次的区间
 */
public class title56 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {2, 3}};
        int[][] merge = merge(intervals);
        for (int i = 0; i < merge.length; i++) {
            for (int j = 0; j < merge[i].length; j++) {
                System.out.println(merge[i][j]);
            }
        }
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {//给数组排序
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        int jizhun[] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if ((jizhun[1] >= intervals[i][0] && jizhun[1] <= intervals[i][1]) || (jizhun[0] >= intervals[i][0] && jizhun[0] <= intervals[i][1]) || (jizhun[0] <= intervals[i][0] && jizhun[1] >= intervals[i][1])) {//能合并
                jizhun = hebin(intervals[i], jizhun);//能合并
            } else {//不能合并,更改基准
                list.add(jizhun);
                jizhun = intervals[i];
            }
        }
        list.add(jizhun);//添加最后一组
        int[][] rst = new int[list.size()][2];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = list.get(i);
        }
        return rst;
    }

    public static int[] hebin(int[] a, int[] b) {
        int start = a[0];
        int end = a[1];
        if (start > b[0]) {
            start = b[0];
        }
        if (end < b[1]) {
            end = b[1];
        }
        return new int[]{start, end};
    }
}
