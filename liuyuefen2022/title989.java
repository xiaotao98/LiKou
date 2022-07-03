package com.LiKou.simple.liuyuefen2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 数组形式的整数加法
 * <p>
 * 思路：让数组的最后一位和k相加，然后将k的最后一位加到list中，然后继续循环，最后反转一下集合
 */
public class title989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k = k + num[i];
            }
            list.add(k % 10);
            k = k / 10;
            i--;
        }
        Collections.reverse(list);
        return list;
    }
}
