package com.LiKou.simple.sansiyuefen2022;

/**
 * 判断是否是：2的幂
 */
public class title231 {
    public static void main(String[] args) {
        boolean bool = isPowerOfTwo(5);
        System.out.println(bool);
    }

    public static boolean isPowerOfTwo(int n) {

        if (n % 2 != 0 && n != 1) {//n为奇数且不为1  直接false
            return false;
        }
        if (n <= 0) {
            return false;
        }
        while (n != 1) {
            n = n / 2;
            if (n % 2 != 0 && n != 1) {
                return false;
            }
        }
        return true;
    }
}
