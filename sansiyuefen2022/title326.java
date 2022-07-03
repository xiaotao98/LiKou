package com.LiKou.simple.sansiyuefen2022;

public class title326 {
    public static void main(String[] args) {
        boolean bool = isPowerOfThree(45);
        System.out.println(bool);
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }
}
