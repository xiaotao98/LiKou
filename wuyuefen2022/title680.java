package com.LiKou.simple.wuyuefen2022;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *
 *  核心思路：当碰到第一个不等的点时，就判断left -- right-1 和  left+1 -- right 之间是否是回文字符串，如果是，则是，否则就不是
 */
public class title680 {
    public static void main(String[] args) {
        String s = "abc";
//        System.out.println(s[0]==s[3]);
        boolean bool = validPalindrome(s);
        System.out.println(bool);
    }

    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;//左右两个指针
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return judge(s, left, right - 1) || judge(s, left + 1, right);//右边删除一个  或者  左边删除一个
            }
        }
        return true;
    }

    //核心思路：当碰到第一个不等的点时，就判断left -- right-1 和  left+1 -- right 之间是否是回文字符串，如果是，则是，否则就不是
    public static boolean judge(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
