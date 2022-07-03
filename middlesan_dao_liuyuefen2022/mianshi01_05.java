package com.LiKou.middle.middlesan_dao_liuyuefen2022;

public class mianshi01_05 {
    public static void main(String[] args) {
        String first = "pales";
        String second = "pal";
        boolean bool = oneEditAway(first, second);
        System.out.println(bool);
    }

    public static boolean oneEditAway(String first, String second) {
        int a = first.length();
        int b = second.length();
        int count = 0;// 记录修改的次数
        if (Math.abs(a - b) >= 2) {//如果长度差值大于等于2  直接返回false
            return false;
        }
        if (a > b) {// 说明是删除操作
            int f = 0, s = 0;//f是first的指针，s是second的指针
            while (f < a && s < b) {
                if (first.charAt(f) != second.charAt(s)) {
                    count++;
                    f++;
                } else {
                    f++;
                    s++;
                }
            }
        } else if (a < b) {// 说明是插入操作
            int f = 0, s = 0;
            while (f < a && s < b) {
                if (first.charAt(f) != second.charAt(s)) {
                    count++;
                    s++;
                } else {
                    f++;
                    s++;
                }
            }
        } else {// 说明是修改操作
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    count++;
                }
            }
        }
        if (count > 1) {
            return false;
        }
        return true;
    }
}
