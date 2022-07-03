package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 * <p>
 * 思路：利用递归的思想
 */
public class title22 {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        int n = 3;
        List<String> list = generateParenthesis(n);
        System.out.println(list);


    }

    public static List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return list;
    }

    private static void dfs(int left, int right, String s) {
        if (left == 0 && right == 0) {// 左右括号都不剩余了，递归终止
            list.add(s);
            return;
        }
        if (left > 0) {//左括号不为空，可以继续递归
            dfs(left - 1, right, s + "(");
        }
        if (right > left) { // 如果右括号剩余多于左括号剩余的话，可以拼接右括
            dfs(left, right - 1, s + ")");
        }
    }
}
