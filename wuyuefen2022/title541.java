package com.LiKou.simple.wuyuefen2022;

/**
 * 反转字符串 II
 *
 * 思路：把字符串按长度k分为0，1，2，3...段   然后将偶数段翻转 即可
 */
public class title541 {
    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;
        String str = reverseStr(s, k);
        System.out.println(str);
    }

    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() / k + (s.length() % k != 0 ? 1 : 0);  //向上取整  比如7按2分  需要分成4段
        int a = 0;
        for (int j = 0; j < i; j++) {
            if (j % 2 == 0) {//偶数段翻转
                StringBuilder sb2 = new StringBuilder();
                if (j == i - 1) {//判断是否是最后一段，避免越界
                    sb2.append(s.substring(a)).reverse();
                } else {
                    sb2.append(s.substring(a, a + k)).reverse();
                }
                sb.append(sb2);
                a = a + k;
            } else {
                if (j == i - 1) {//判断是否是最后一段，避免越界
                    sb.append(s.substring(a));
                } else {
                    sb.append(s.substring(a, a + k));
                }
                a = a + k;
            }
        }
        return sb.toString();
    }
}
