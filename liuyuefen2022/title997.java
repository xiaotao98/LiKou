package com.LiKou.simple.liuyuefen2022;

/**
 * 找到小镇的法官
 * <p>
 * 思路：就是在n个人中  找到入度为n-1，出度为0的人
 */
public class title997 {

    public static int findJudge(int n, int[][] trust) {
        int out[] = new int[n + 1];//出度数组
        int in[] = new int[n + 1];//入度数组
        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];
            out[a] = out[a] + 1;
            in[b] = in[b] + 1;
        }
        for (int i = 1; i < in.length; i++) {
            if (in[i] == n - 1 && out[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
