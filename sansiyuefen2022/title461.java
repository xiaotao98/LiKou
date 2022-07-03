package com.LiKou.simple.sansiyuefen2022;

/**
 * 汉明距离
 */
public class title461 {
    public static void main(String[] args) {
        int result = hammingDistance2(25, 1);
        System.out.println(result);
    }

    /**
     *思路1：将两个整数转为相同长度的二进制，然后遍历每一位，不同的话计数器+1
     */
    public static int hammingDistance(int x, int y) {
        String xs = Integer.toBinaryString(x);
        String ys = Integer.toBinaryString(y);
        int max = xs.length();//求出最长的字符串长度
        if (ys.length() > max) {
            max = ys.length();
        }
        //让两个字符串长度相等
        while (xs.length() < max) {
            xs = "0" + xs;
        }
        while (ys.length() < max) {
            ys = "0" + ys;
        }
        int count = 0;
        for (int i = 0; i < max; i++) {
            if (xs.charAt(i) != ys.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     *思路2：将两个数进行一个异或操作   然后不同的位置为1  统计1的个数就可以了
     */
    public static int hammingDistance2(int x, int y) {
        int i = x ^ y;
        int count = Integer.bitCount(i);
        return count;

    }
}
