package com.LiKou.simple.wuyuefen2022;

public class title507 {
    public static void main(String[] args) {
        boolean bool = checkPerfectNumber(7);
        System.out.println(bool);
    }

    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}
