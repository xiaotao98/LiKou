package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 最长回文子串
 * <p>
 * 思路：把回文看成中间的部分全是同一字符，左右部分相对称  先找中间部分，然后找两边   保存最长的
 */
public class title5 {
    public String longestPalindrome(String s) {
        int rst[] = new int[2];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            i = huiwen(chars, i, rst);//找到下一个与当前字符不同的字符
        }
        return s.substring(rst[0], rst[1] + 1);
    }

    public int huiwen(char[] chars, int start, int rst[]) {
        int end = start;
        while (end < chars.length - 1 && chars[end] == chars[end + 1]) {//把回文串中间部分看成都是相同的
            end++;
        }
        int res = end;//记录中间部分的最后一个值  下一次从这个数的下一位开始
        while (start > 0 && end < chars.length - 1 && chars[start - 1] == chars[end + 1]) {//从中间往左右两边扩展  看是否为回文串
            start--;
            end++;
        }
        if (end - start > rst[1] - rst[0]) {//判断长度是否比之前的大  大的话就更新结果数组
            rst[0] = start;
            rst[1] = end;
        }
        return res;
    }
}
