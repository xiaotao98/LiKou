package com.LiKou.simple.wuyuefen2022;

import java.util.HashSet;
import java.util.Set;

/**
 * 亲密字符串
 *
 * 思路：分情况讨论：1字符串相同的情况，只要有重复字母，就是true   2字符串不同，就比较交换后的是否相等 3长度不等，直接返回false
 */
public class title859 {
    public static void main(String[] args) {
        String s = "aa";
        String goal = "aa";
        boolean bool = buddyStrings(s, goal);
        System.out.println(bool);
    }

    public static boolean buddyStrings(String s, String goal) {
        if (s.length()!=goal.length())return false;
        if (s.equals(goal)) {//字符串相等，只要有重复元素就返回true
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                boolean bool = set.add(s.charAt(i));
                if (!bool) {
                    return true;
                }
            }
            return false;
        }
        int first = -1, second = -1, k = 0;// k是用来记出现不同字母的次数
        for (int i = 0; i < s.length(); i++) {//字母不相同的情况
            if (s.charAt(i) != goal.charAt(i) && k == 0) {
                first = i;
                k++;
                continue;
            }
            if (s.charAt(i) != goal.charAt(i) && k == 1) {
                second = i;
                k++;// 此时找到了两点，交换进行判断
                char c1 = s.charAt(first);
                char c2 = s.charAt(second);
                StringBuilder sb = new StringBuilder(s);
                sb.setCharAt(first, c2);//交换
                sb.setCharAt(second, c1);
                String new_str = sb.toString();
                if (new_str.equals(goal)) {
                    return true;//交换后相等
                }
                return false;//交换后不相等
            }
        }
        return true;
    }
}
