package com.LiKou.simple.sansiyuefen2022;

/**
 * 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
 *
 *思路：这个字串长度最小为1，最长为s.length()/2,然后暴力法
 * 假设字串长度为1，叠加，看是否和原来的字符串相等。。。子串长度为s.length()/2，叠加，看是否和原来的字符串相等
 */
public class title459 {
    public static void main(String[] args) {
        String s = "abcabcabcabc";
        boolean bool = repeatedSubstringPattern(s);
        System.out.println(bool);
    }

    public static boolean repeatedSubstringPattern(String s) {
        if (s.length() < 2) {
            return false;
        }
        for (int i = 1; i <= s.length() / 2; i++) {//i为字串长度
            if (s.length() % i != 0) {//不可能为字串的长度
                continue;
            }
            String zi = s.substring(0, i);
            String newString="";
            for (int j = 1; j <= s.length() / i; j++) {
                newString = newString + zi;
            }
            if (newString.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
