package com.LiKou.simple.wuyuefen2022;

import java.util.HashSet;
import java.util.Set;

/**
 *唯一摩尔斯密码词
 *
 * 思路：用数组存密码   遍历字符串数组   把其中的每一个字符串所对应的密码存入到set集合中即可
 */
public class title804 {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        int i = uniqueMorseRepresentations(words);
        System.out.println(i);
    }

    public static int uniqueMorseRepresentations(String[] words) {

        Set<String> set = new HashSet<>();
        String mima[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (int i = 0; i < words.length; i++) {
            String tr = "";
            for (int j = 0; j < words[i].length(); j++) {
                tr = tr + mima[words[i].charAt(j) - 'a'];
            }
            set.add(tr);
        }
        return set.size();
    }
}
