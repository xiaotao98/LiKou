package com.LiKou.simple.sansiyuefen2022;

import java.util.HashMap;
import java.util.Map;

/**
 * 数字转换为十六进制数
 * <p>
 * 思路：首先十六进制只有1-15，然后四位二进制是是一个十六进制   所以每次先算四位二进制
 */
public class title405 {
    public static void main(String[] args) {
        String s = toHex(-1);
        System.out.println(s);
    }

    public static String toHex(int num) {
        String s[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 8 && num != 0) {//32位二进制  最多8位16进制
            String s1 = s[num & 0xf];
            sb.append(s1);
            num = num >> 4;
        }
        return sb.reverse().toString();
    }
}
