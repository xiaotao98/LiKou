package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 最长特殊序列 II
 * <p>
 * 思路：拿每一个字符串和其他字符串比较，如果不是子串，len=Max(len,当前字串长度)。如果是子串，直接跳到下一个字符串，重复上述步骤
 */
public class title522 {

    public int findLUSlength(String[] strs) {
        int len = -1;
        boolean flag = true;
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i != j && zichuang(strs[i], strs[j])) {
                    flag = false;//标记为子串
                    break;
                }
            }
            if (flag) {//只有不是子串，才能取值
                len = Math.max(len, strs[i].length());
            }
            flag = true;
        }
        return len;
    }

    /**
     * 判断s1是否为s2的子串
     */
    public boolean zichuang(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) == s2.charAt(index2)) {
                index1++;
            }
            index2++;
        }
        return index1 == s1.length();
    }

}
