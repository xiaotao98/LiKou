package com.LiKou.simple.wuyuefen2022;

/**
 * 山羊拉丁文
 *
 * 思路：判断每个单词的首字母是否是元音  然后分两种规则来进行  即可
 */
public class title824 {
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        String string = toGoatLatin(sentence);
        System.out.println(string);
    }

    public static String toGoatLatin(String sentence) {
        String yuanyinString = "aeiouAEIOU";
        StringBuilder sBuilder = new StringBuilder();
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (yuanyinString.contains(split[i].substring(0, 1))) {// 首字母是元音字母
                if (i != split.length - 1) {
                    sBuilder.append(split[i] + "ma");
                    for (int j = 0; j <= i; j++) {
                        sBuilder.append("a");
                    }
                    sBuilder.append(" ");
                } else {
                    sBuilder.append(split[i] + "ma");
                    for (int j = 0; j <= i; j++) {
                        sBuilder.append("a");
                    }
                }
            } else {// 首字母不是元音字母
                if (i != split.length - 1) {
                    sBuilder.append(split[i].substring(1, split[i].length()) + split[i].substring(0, 1) + "ma");
                    for (int j = 0; j <= i; j++) {
                        sBuilder.append("a");
                    }
                    sBuilder.append(" ");
                } else {
                    sBuilder.append(split[i].substring(1, split[i].length()) + split[i].substring(0, 1) + "ma");
                    for (int j = 0; j <= i; j++) {
                        sBuilder.append("a");
                    }
                }
            }
        }
        return sBuilder.toString();
    }
}
