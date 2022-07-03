package com.LiKou.simple.wuyuefen2022;

/**
 * 旋转字符串
 * <p>
 * 思路:最多翻转s.length()-1次，一次一次的翻转  如果翻转这么多次仍然没有相等的  则返回false
 */
public class title796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced";
        boolean bool = rotateString(s, goal);
        System.out.println(bool);
    }

    public static boolean rotateString(String s, String goal) {
        if (s.equals(goal)) {
            return true;
        }
        for (int i = 1; i < s.length(); i++) {// 最多翻转s.length()-1次
            s = s.substring(1) + s.substring(0, 1);
            if (s.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
