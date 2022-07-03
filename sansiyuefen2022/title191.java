package com.LiKou.simple.sansiyuefen2022;

/**
 * 位1的个数
 * 思路：将数字转为二进制，然后计算其中的1的个数
 */
public class title191 {
    public static void main(String[] args) {
        int n = 17;
        int result = hammingWeight(n);
        System.out.println(result);
    }

    public static int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int result = 0;
        while (s.length() < 32) {
            s = "0" + s;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }

}
