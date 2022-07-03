package com.LiKou.simple.wuyuefen2022;

public class title557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String reverseWords = reverseWords(s);
        System.out.println(reverseWords);
    }

    public static String reverseWords(String s) {
        String[] split = s.split(" ");//先分开
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i!=split.length-1){//每个字符串要翻转并且加一个空格
                StringBuilder sb2 = new StringBuilder();
                StringBuilder reverse = sb2.append(split[i]).reverse();
                sb.append(reverse + " ");
            }else {//最后一个字符串不需要加空格
                StringBuilder sb2 = new StringBuilder();
                StringBuilder reverse = sb2.append(split[i]).reverse();
                sb.append(reverse );
            }
        }
        return sb.toString();
    }
}
