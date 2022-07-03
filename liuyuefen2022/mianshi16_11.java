package com.LiKou.simple.liuyuefen2022;

/**
 * 跳水板
 *
 * 思路：三种情况   1    k为0
 *                2   短板和长板相等
 *                3   短板和长板不相等
 *                注意，返回的长度需要从小到大排列
 */
public class mianshi16_11 {

    public static int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[]{};
        }
        if (shorter == longer) {
            return new int[]{k*shorter};
        }
        int arr[] = new int[k + 1];
        if (k == 0) {
            return new int[]{};
        }
        for (int i = 0; i <= k; i++) {
            arr[i] = i * longer + (k - i) * shorter;
        }
        return arr;
    }

}
