package com.LiKou.simple.wuyuefen2022;

import java.util.HashSet;
import java.util.Set;

/**
 * 独特的电子邮件地址
 *
 * 思路：先将邮件按 @ 分成两部分，然后根据规则重构前面部分，最后加上后面部分 放到set中，即可
 */
public class title929 {
    public static void main(String[] args) {
        String[] emails= {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        int i = numUniqueEmails(emails);
        System.out.println(i);
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String[] split = emails[i].split("@");
            String s1 = "";
            for (int j = 0; j < split[0].length(); j++) {
                if (split[0].charAt(j) >= 'a' && split[0].charAt(j) <= 'z') {
                    s1 = s1 + split[0].charAt(j);
                } else if (split[0].charAt(j) == '.') {
                    s1 = s1;
                } else {
                    break;
                }
            }
            set.add(s1 + "@" + split[1]);
        }
        return set.size();
    }
}
