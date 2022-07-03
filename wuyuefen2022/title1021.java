package com.LiKou.simple.wuyuefen2022;

import java.util.Stack;

/**
 * 删除最外层的括号
 * <p>
 * 思路：左括号进栈，右括号出栈，当栈为空,就找到原语分界点，标记一下，一直遍历完字符串。然后把字符串进行一个分割，注意分割的数值就好了
 */
public class title1021 {
    public static void main(String[] args) {
        String s = "()()";
        String s1 = removeOuterParentheses(s);
        System.out.println(s1);

    }

    public static String removeOuterParentheses(String s) {
        String str = "";
        Stack<Character> stack = new Stack<>();
        int arr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    arr[i] = 1;//在源于分化的位置标记为1
                }
            }
        }
        int start = 1;//第一个原语分化开始下标为1，因为需要去掉最外面括号
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                str = str + s.substring(start, i);
                start = i + 2;//更新开始下标，+2也是因为需要去掉最外面括号
            }
        }
        return str;
    }
}
