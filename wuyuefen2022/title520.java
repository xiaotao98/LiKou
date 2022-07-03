package com.LiKou.simple.wuyuefen2022;

public class title520 {
    public static void main(String[] args) {
       String word = "USA";
        boolean bool = detectCapitalUse(word);
        System.out.println(bool);
    }

    public static boolean detectCapitalUse(String word) {
        int a = 0, b = 0, c = 0;//三种合法情况
        for (int i = 0; i < word.length(); i++) {
            if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                a++;
            } else {
                b++;
            }
        }
        if (a == word.length() || b == word.length()) {//全大写  或者全小写
            return true;
        }
        if ('A' <= word.charAt(0) && word.charAt(0) <= 'Z' && b == word.length() - 1) {//首字母大写
            return true;
        }
        return false;
    }
}
