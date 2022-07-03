package com.LiKou.simple.wuyuefen2022;

/**
 * 比较含退格的字符串
 * <p>
 * 思路：遍历每个字符串，然后比较他们遍历完后的新字符串是否相等
 */
public class title844 {
    public static void main(String[] args) {
        String s = "a#c";
        String t = "b";
        boolean bool = backspaceCompare(s, t);
        System.out.println(bool);
    }

    public static boolean backspaceCompare(String s, String t) {
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                s1 = s1 + s.charAt(i);
            } else {
                if (s1.length() != 0) {
                    s1 = s1.substring(0, s1.length() - 1);
                } else {
                    s1 = "";
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                s2 = s2 + t.charAt(i);
            } else {
                if (s2.length() != 0) {
                    s2 = s2.substring(0, s2.length() - 1);
                } else {
                    s2 = "";
                }
            }
        }
        return s1.equals(s2);
    }
}
