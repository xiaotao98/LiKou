package com.LiKou.simple.liuyuefen2022;

/**
 * 访问所有点的最小时间
 *
 * 思路：在这里  水平或者竖直，或者斜线方向移动都是1   所以两个点的距离   就就取他们x差的绝对值，就取他们x差的绝对值
 */
public class title1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length - 1; i++) {//计算一个点到下一个点所需要的距离
            int[] one = points[i];
            int[] two = points[i + 1];
            int max = Math.max(Math.abs(one[0] - two[0]), Math.abs(one[1] - two[1]));
            count = count + max;
        }
        return count;
    }

}
