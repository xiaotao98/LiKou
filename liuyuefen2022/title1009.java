package com.LiKou.simple.liuyuefen2022;

/**
 * 十进制整数的反码
 * <p>
 * 思路：与第476相同
 */
public class title1009 {
    /**
     * 方法一
     */
    public int bitwiseComplement1(int n) {
        String s = Integer.toBinaryString(n);
        char[] schars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < schars.length; i++) {
            if (schars[i] == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        String news = sb.toString();//得到的是反码的二进制
        return Integer.valueOf(news, 2);//将反码的十进制再+1
    }

    /**
     * 方法二
     */
    public static int bitwiseComplement2(int n) {
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                chars[i] = '0';
            } else {
                chars[i] = '1';
            }
        }
        String new_s = "";
        for (char c : chars) {
            new_s = new_s + c;
        }
        Integer rst = Integer.valueOf(new_s, 2);
        return rst;
    }

}
