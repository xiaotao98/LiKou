package com.LiKou.simple.wuyuefen2022;

public class title693 {
    public static void main(String[] args) {
        boolean bool = hasAlternatingBits(7);
        System.out.println(bool);
    }

    public static boolean hasAlternatingBits(int n) {
        String erString = Integer.toBinaryString(n);
        for (int i = 0; i < erString.length()-1; i++) {
            if (erString.charAt(i)==erString.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}
