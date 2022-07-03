package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 整数转罗马数字
 *
 * 思路：
 */
public class title12 {

    public String intToRoman(int num) {
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String reps[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String rst = "";
        while (num > 0) {//确定num是个大于0的数
            for (int i = 0; i < values.length; i++) {//确定从大的开始加
                while (num >= values[i]) {//先把大的给加完
                    rst = rst + reps[i];
                    num = num - values[i];
                }
            }
        }
        return rst;
    }

    public String intToRoman2(int num) {
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String reps[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String rst = "";
        while (num > 0) {//确定num是个大于0的数
            for (int i = 0; i < values.length; i++) {//确定从大的开始加
                if (num >= values[i]) {//先加大的
                    rst = rst + reps[i];
                    num = num - values[i];//加了一个数  就删除这个数
                    break;
                }
            }
        }
        return rst;
    }

}
