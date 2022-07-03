package com.LiKou.simple.liuyuefen2022;

/**
 * 公交站间的距离
 * <p>
 * 思路1：把它变为总是小站走向大站（可以省略一些判断）  计算左距和右距，取其中最小的那个
 * <p>
 * 思路2：计算左距和右距，取其中最小的那个。定义bool=false，如果bool=ture代表到达目的地
 */
public class title1184 {


    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int left = 0, right = 0;
        int l = Math.min(start, destination);
        int r = Math.max(start, destination);//总是l走向r
        for (int i = l; i < distance.length; i++) {
            if (i == r) {//说明到达了终点，终止
                break;
            }
            right = right + distance[i];
        }
        for (int i = l; i >= 0; i--) {
            if (i - 1 >= 0) {
                left = left + distance[i - 1];
            } else {
                left = left + distance[distance.length - 1];
            }
        }
        for (int i = distance.length - 1; i > r; i--) {//没有走到目的地,继续从尾巴走
            left = left + distance[i - 1];
        }
        return Math.min(left, right);
    }

    /**
     * 计算左距和右距，取其中最小的那个。
     */
    public static int distanceBetweenBusStops2(int[] distance, int start, int destination) {
        boolean bool = false;//标记往往左边走是否走到目的地
        int left = 0, right = 0;
        for (int i = start; i < distance.length; i++) {
            if (i == destination) {//说明到达了终点，终止
                bool = true;//走到目的地
                break;
            }
            right = right + distance[i];
        }
        if (!bool) {//没有走到目的地,继续从头走到目的地
            for (int i = 0; i < destination; i++) {
                right = right + distance[i];
            }
        }
        bool = false;
        for (int i = start; i >= 0; i--) {
            if (i == destination) {//说明到达了终点，终止
                bool = true;//走到目的地
                break;
            }
            if (i - 1 >= 0) {
                left = left + distance[i - 1];
            } else {
                left = left + distance[distance.length - 1];
            }

        }
        if (!bool) {//没有走到目的地,继续从尾巴走
            for (int i = distance.length - 1; i > destination; i--) {
                left = left + distance[i - 1];
            }
        }
        return Math.min(left, right);
    }

}
