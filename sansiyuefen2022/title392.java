package com.LiKou.simple.sansiyuefen2022;

/**
 * 判断 s 是否为 t 的子序列
 *
 * 双指针   速度求解
 */
public class title392 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean bool = isSubsequence(s, t);
        System.out.println(bool);

    }

    public static boolean isSubsequence(String s, String t) {
        int sindex = 0, tindex = 0;
        while (sindex < s.length() && tindex < t.length()) {
            if (s.charAt(sindex) == t.charAt(tindex)) {
                sindex++;//s中的指针只有在找到时，才会移动
            }
            tindex++;//t中的指针一直都会移动
        }
        return sindex == s.length();
    }


    //自己想到的思路：过于麻烦
    public static boolean isSubsequence1(String s, String t) {
        if (s.length() > t.length()) {//s长度大于t，返回false
            return false;
        }
        int index = 0;//在t中设置的指针
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            for (int j = index; j < t.length(); j++) {
                if (t.charAt(j) == schar) {//t中找到了
                    if (i != s.length() - 1) {//当前所找到的字符不是s中的最后一个，那么需要继续移动index指针
                        index = j + 1;
                    }
                    break;
                }
                if (index < t.length() - 1) {//index指针没达到最后，可以加一
                    index++;
                } else {//index指针已经到达最后，直接返回false
                    return false;
                }
            }
            if (index >= t.length()) {//index>length   说明在t里面没有找到
                return false;
            }
        }
        return true;
    }

}
