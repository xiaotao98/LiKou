package com.LiKou.simple.liuyuefen2022;

/**
 * 有效的回旋镖
 * <p>
 * 思路：判断一个点和另外两个点的斜率是否相同，如果相同，说明无效，否则有效    注意两点的斜率公式 用了除法   在这里转为乘法
 */
public class title1037 {
    public static boolean isBoomerang(int[][] points) {
        int a = (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]);
        int b = (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);
        if (a == b) return false;
        return true;
    }
}
