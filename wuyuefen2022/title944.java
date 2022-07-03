package com.LiKou.simple.wuyuefen2022;

/**
 * 删列造序
 * <p>
 * 思路：用第一个字符串和后面的来比
 */
public class title944 {
    public static void main(String[] args) {
        String[] strs = {"a", "b"};
        int result = minDeletionSize(strs);
        System.out.println(result);
    }

    public static int minDeletionSize(String[] strs) {
        int slen = strs[0].length();
        int count = 0;// 记录要删除的列数
        for (int i = 0; i < slen; i++) {
            // 先比对第一个，然后一个一个比对
            char first = strs[0].charAt(i);// 数组中第一个字符串第i个位置的数值
            for (int j = 1; j < strs.length; j++) {
                char end = strs[j].charAt(i);
                if (end - first >= 0) {
                    first = end;
                } else {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
