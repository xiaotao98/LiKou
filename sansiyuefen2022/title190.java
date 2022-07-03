package com.LiKou.simple.sansiyuefen2022;


/**
 * 思路：
 * 先将整数转为二进制字符串，然后，然段长度是否为32，如果不是32，将其补为32位
 * 然后遍历每一位   用2的幂把所有的1加起来
 * 注意：颠倒顺序后  首位为1的二进制  最后需要再加1
 */
public class title190 {
    public static void main(String[] args) {
        //输入是一个整数n
        int n = 100;
//        int n = 00000010100101000001111010011100;
//        int x =  Integer.valueOf("00111001011110000010100101000000",2);
//        System.out.println(n);
//        System.out.println(x);
        int result = reverseBits(n);
        System.out.println(result);
    }

    public static int reverseBits(int n) {

        String s = Integer.toBinaryString(n);
        while (s.length() < 32) {
            s = "0" + s;
        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                result = result + (int) Math.pow(2, i);
            }
        }
        if (s.charAt(31) == '1') {
            result = result + 1;
        }
        return result;

    }

    public static int reverseBits2(int n) {

        String s = Integer.toBinaryString(n);
        while (s.length() < 32) {
            s = "0" + s;
        }

        StringBuilder sb=new StringBuilder(s);
        Integer i = Integer.parseUnsignedInt(sb.toString(), 2);
        return i;

    }

}
