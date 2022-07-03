package com.LiKou.simple.wuyuefen2022;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 词典中最长的单词
 */
public class title720 {
    public static void main(String[] args) {
        String[] words = {"rac","rs","ra","on","r","otif","o","onpdu","rsf","rs","ot","oti","racy","onpd"};
        String s = longestWord(words);
        System.out.println(s);
    }

    public static String longestWord(String[] words) {
        String res = "";
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        for (String s : words) {
            //  把单词为一个字母以及共有的单词加入到集合set中
            if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {//判断当前的单词是否为是之前单词构造出来的
                if (s.length() > res.length()) {
                    res = s;
                }
                set.add(s);//set只存符合要求构造的单词，如只有ab  abc  这样的单词是不存的
            }
        }
        return res;
    }
}
