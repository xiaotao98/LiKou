package com.LiKou.simple.liuyuefen2022;

/**
 * 一年中的第几天
 * <p>
 * 思路：注意大小月  然后注意闰年的二月即可
 * 判断闰年的条件：1 能被4整除但不能被100整除   或者 2  能被400整除
 */
public class title1154 {

    public static void main(String[] args) {
        String date = "1972-08-01";
        int i = dayOfYear(date);
        System.out.println(i);
    }

    public static int dayOfYear(String date) {
        int num = 0;
        String bigmouth = "135781012";
        String[] split = date.split("-");
        int year = Integer.valueOf(split[0]);
        boolean rui = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            rui = true;
        }
        int yue = Integer.valueOf(split[1]);
        for (int i = 1; i < yue; i++) {
            if (i == 2) {
                if (rui) {
                    num = num + 29;
                } else {
                    num = num + 28;
                }

            } else if (bigmouth.contains(String.valueOf(i))) {
                num = num + 31;
            } else {
                num = num + 30;
            }
        }
        int day = Integer.valueOf(split[2]);
        num = num + day;
        return num;
    }

}
