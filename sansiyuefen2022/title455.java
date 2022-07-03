package com.LiKou.simple.sansiyuefen2022;

import java.util.Arrays;

/**
 * 分发饼干
 *
 * 思路：首先对两个数组进行从小到大排序。。。
 */
public class title455 {
    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        int result = findContentChildren(g, s);
        System.out.println(result);
    }

    /**
     * 方法一
     * @param g
     * @param s
     * @return
     */
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);//先对两个数组排序
        Arrays.sort(s);
        int num = 0;//记能满足的数量
        int sindex = 0;//数组s的指针
        for (int i = 0; i < g.length; i++) {//遍历这两个数组
            for (int j = sindex; j < s.length; j++) {
                if (s[j] >= g[i]) {//满足条件，num++，同时在数组s下次直接从j+1开始找，退出本次循环
                    num++;
                    sindex = j + 1;
                    break;
                }
            }
            if (sindex >= s.length) {//数组s找完了，直接退出循环
                break;
            }
        }
        return num;
    }

    /**
     * 方法二
     * @param g
     * @param s
     * @return
     */
    public static int findContentChildren2(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int numOfChildren = g.length, numOfCookies = s.length;
        int i = 0, j = 0;
        for ( i = 0, j = 0; i < numOfChildren && j < numOfCookies;  j++) {

            if (g[i]<=s[j]) {
                i++;
            }
        }
        return i;
    }
}
