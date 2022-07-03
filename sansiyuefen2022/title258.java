package com.LiKou.simple.sansiyuefen2022;

/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
 *
 * 思路：如果给的是一位数，直接返回；否则进入while循环，将int转为string再转为char数组
 * 然后遍历char数组，把char转为int都加起来，如果sum<10则跳出，否则继续循环
 */
public class title258 {
    public static void main(String[] args) {
        int i = addDigits(0);
        System.out.println(i);
    }

    public static int addDigits(int num) {
        if (0 <= num && num <= 9) {
            return num;
        }
        while (num>=10){
            String s = String.valueOf(num);
            char[] chars = s.toCharArray();
            int sum=0;
            for (int i = 0; i < chars.length; i++) {
                sum=sum+chars[i]-'0';
            }
            num=sum;
        }
        return num;

    }
}
