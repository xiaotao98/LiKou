package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路：先把字符串转为对应的整数集合，比如AB转为1，2
 * 然后找规律：AB为  1*26^1+2*26^0
 *          ZY为  26*26^1+25*26^0
 */
public class title171 {
    public static void main(String[] args) {
        String columnTitle = "ZY";
        int i = titleToNumber(columnTitle);
        System.out.println(i);
    }

    public static int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            Integer aChar = Integer.valueOf(chars[i]) - 64;
            list.add(aChar);
        }
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i) * (int) Math.pow(26, list.size() - (i + 1));
        }
        return sum;
    }

}
