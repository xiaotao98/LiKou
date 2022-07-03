package com.LiKou.simple.wuyuefen2022;

/**
 * 二进制表示中质数个计算置位
 * <p>
 * 思路：题目的意思是在left-right中  看他们中有谁的二进制1的个数是素数
 * 首先找到每个数二进制中1的个数，然后判断1的个数是否为素数即可   注意  1不是素数
 */
public class title762 {
    public static void main(String[] args) {
        int i = countPrimeSetBits(10, 15);
        System.out.println(i);

    }

    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int count_1 = count(i);// 统计二进制1的个数    Integer.bitCount(i)一句话就搞定这个函数
            boolean bool = judge(count_1);// 判断是否为质数
            if (bool) {
                count++;
            }
        }
        return count;
    }

    public static int count(int i) {
        int num = 0;
        String string = Integer.toBinaryString(i);
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) == '1') {
                num++;
            }
        }
        return num;
    }

    public static boolean judge(int i) {
        if (i == 1) {
            return false;// 注意1不是质数
        }
        if (i == 2) {
            return true;
        }
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
