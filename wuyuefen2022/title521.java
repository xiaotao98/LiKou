package com.LiKou.simple.wuyuefen2022;

public class title521 {
    public static void main(String[] args) {
        String a="ab";
        String b="ba";
        int i = findLUSlength(a, b);
        System.out.println(i);
    }
    public static int findLUSlength(String a, String b) {
        if(a.equals(b)){//两个串相等  直接返回-1
            return -1;
        }
        return Math.max(a.length(),b.length());//否则  返回最长的那个串长度
    }
}
