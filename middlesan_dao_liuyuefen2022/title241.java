package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 为运算表达式设计优先级
 * <p>
 * 思路：分治法， 遇到运算符  就递归 左 右，然后将左右和这个运算符做运算
 */
public class title241 {

    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));//左边
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));//右边  注意这里是i+1 需要跳过那个符号
                for (int l : left) {
                    for (int r : right) {
                        if (expression.charAt(i) == '+') {
                            list.add(l + r);
                        } else if (expression.charAt(i) == '-') {
                            list.add(l - r);
                        } else {
                            list.add(l * r);
                        }
                    }
                }
            }
        }
        if (list.isEmpty()) {//如果list为空，说明不存在运算符能对字符串进行划分，因此一定是一个纯数字的字符串
            list.add(Integer.valueOf(expression));
        }
        return list;
    }
}
