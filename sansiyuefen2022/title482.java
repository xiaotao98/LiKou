package com.LiKou.simple.sansiyuefen2022;

public class title482 {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String newStr = licenseKeyFormatting(s, k);
        System.out.println(newStr);
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String s1 = s.toUpperCase();//把小写字母都转为大写字母
        for (int i = 0; i < s.length(); i++) {
            if (s1.charAt(i) != '-') {
                sb.append(s1.charAt(i));//把所有字母和数字加入到sb中
            }
        }
        //从后往前，每隔距离k插入一个“-”
        int length = sb.toString().length() - k;
        while (length > 0) {
            sb.insert(length, "-");
            length = length - k;
        }
        return sb.toString();
    }
}
