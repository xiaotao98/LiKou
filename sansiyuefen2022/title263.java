package com.LiKou.simple.sansiyuefen2022;

/**
 * 丑数 就是只包含质因数 2、3 和 5 的正整数。
 * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
 * <p>
 * 思路：能整除2，3，5就一直除下去，如果最后数字为1返回true，否则返回false
 * 注意：n<1都返回false
 */
public class title263 {
    public static void main(String[] args) {
        boolean bool = isUgly(14);
        System.out.println(bool);
    }

    public static boolean isUgly(int n) {

        if (n < 1) {
            return false;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }

    }
}
