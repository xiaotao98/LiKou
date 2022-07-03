package com.LiKou.simple.sansiyuefen2022;

/**
 * 两个字符串相加
 * <p>
 * 思路：每一位转为整数然后想加呗
 */
public class title415 {
    public static void main(String[] args) {
        String s = addStrings("123", "91");
        System.out.println(s);
    }

    public static String addStrings(String num1, String num2) {
        int len1 = num1.length() - 1;       //定义了字符串最后一位
        int len2 = num2.length() - 1;
        int jinwei = 0;
        StringBuilder sb = new StringBuilder();
        while (len1 >= 0 || len2 >= 0 || jinwei != 0) {
            int x1 = len1 >= 0 ? num1.charAt(len1) - '0' : 0;   // 低位数的直接补0  char-'0'   char转int
            int x2 = len2 >= 0 ? num2.charAt(len2) - '0' : 0;
            int sum = x1 + x2 + jinwei;
            sb.append(sum % 10);//每一位得和的余数加入到sb中
            jinwei = sum / 10;
            len1--;
            len2--;
        }
        return sb.reverse().toString();
    }
}
