package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.Stack;

/**
 * 字符串解码
 * <p>
 * 思路：利用两个栈，栈1存数字，栈2存sb，注意，初始时栈2需要存一个空sb。
 * 随后，遇到数字，数字存栈1，然后栈2存空sb(这是为了存这个数字所包含的字符串)。
 * 遇到 [ 跳过
 * 遇到 ] 栈1取栈顶值 i  栈2取栈顶值 sb  随后将栈2的栈顶值 添加i次的sb
 */
public class title394 {
    public static String decodeString(String s) {
        char[] arr = s.toCharArray();
        Stack<Integer> stack1 = new Stack<>();//保存数字
        Stack<StringBuilder> stack2 = new Stack<>();//保存StringBuilder
        stack2.push(new StringBuilder());
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c <= '9' && c >= '0') {// 遇到数字直接入栈
                int p = i;
                while (i < arr.length && arr[i] <= '9' && arr[i] >= '0') {//因为数字可能是多位，比如100
                    i++;
                }
                stack1.push(Integer.parseInt(s.substring(p, i)));
                stack2.push(new StringBuilder());//注意  碰到一次数字，需要新添加一个空的sb，用来保存此次的字符
                i = i - 1;
            } else if (c >= 'a' && c <= 'z') {// 栈顶的sb添加
                stack2.peek().append(c);
            } else if (c == ']') {//遇到反括号，需要加多次
                int times = stack1.pop();
                StringBuilder lastSb = stack2.pop();
                for (int j = 0; j < times; j++) {
                    stack2.peek().append(lastSb.toString());
                }
            }
        }
        return stack2.peek().toString();
    }
}
