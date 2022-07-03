package com.LiKou.simple.liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 一周中的第几天
 *
 * 思路：1971第一天是周五  然后计算当天到1971.1.1总共是多少天   对7取余即可
 * 首先计算不是当天的天数  +365或者+366  然后计算当年天数
 */
public class title1185 {
    public static void main(String[] args) {
        String s = dayOfTheWeek(31, 8, 2019);
        System.out.println(s);


    }

    public static String dayOfTheWeek(int day, int month, int year) {
        int allday = dayOfyear(day, month, year);
        String s[] = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        int index = allday % 7;
        return s[index];
    }

    public static int dayOfyear(int day, int month, int year) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(12);
        int count = 0;
        for (int i = 1971; i < year; i++) {
            boolean flag = false;
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                flag = true;
            }
            if (flag) {
                count = count + 366;
            } else {
                count = count + 365;
            }
        }
        //首先判断是否是闰年
        boolean flag = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            flag = true;
        }
        for (int i = 1; i < month; i++) {
            if (i == 2) {
                if (flag) {
                    count = count + 29;
                } else {
                    count = count + 28;
                }
            } else if (list.contains(i)) {
                count = count + 31;
            } else {
                count = count + 30;
            }
        }
        count = count + day;
        return count;
    }
}
