package com.LiKou.simple.liuyuefen2022;

import java.util.Stack;

/**
 * 删除字符串中的所有相邻重复项
 *
 * 思路：利用栈  栈空，直接入栈  栈不空，判断栈顶值是否与目前的值相等，相等就出栈，不等就入栈
 */
public class title1047 {

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()) {//栈空，直接入栈
                stack.push(chars[i]);
            } else {
                if (stack.peek() == chars[i]) {//栈不空，判断栈顶值是否与目前的值相等，相等就出栈，不等就入栈
                    stack.pop();
                } else {
                    stack.push(chars[i]);
                }
            }
        }
        String new_s = "";
        while (!stack.isEmpty()) {
            new_s = stack.pop() + new_s;
        }
        return new_s;
    }

}
