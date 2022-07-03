package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 环绕字符串中唯一的子字符串
 *
 * 就是找p中所有的连续子串   且子串都在s中出现过的
 *
 * 思路：就是找每个不同字母结尾的最长连续子串长度之和   dp[i]就是以i结尾的子串最长长度
 */
public class title467 {
    public static void main(String[] args) {
        String p = "zab";
        int i = findSubstringInWraproundString(p);
        System.out.println(i);
    }

    public static int findSubstringInWraproundString(String p) {
        int len = p.length();
        int dp[] = new int[26];
        int count = 0;
        int lens = 1;
        for (int i = 0; i < len; i++) {
            if (i > 0 && (p.charAt(i) - p.charAt(i - 1) == 1 || p.charAt(i) - p.charAt(i - 1) == -25)) {
                lens++;
            } else {
                lens = 1;
            }
            dp[p.charAt(i) - 'a'] = Math.max(lens, dp[p.charAt(i) - 'a']);
        }
        for (int i = 0; i < dp.length; i++) {
            count = count + dp[i];
        }
        return count;
    }
}
