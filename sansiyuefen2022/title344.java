package com.LiKou.simple.sansiyuefen2022;

/**
 *  反转字符串
 *
 *  思路：就是一个简单的  两个变量数值交换
 */
public class title344 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
        for (char c : s) {
            System.out.println(c);
        }

    }
}
