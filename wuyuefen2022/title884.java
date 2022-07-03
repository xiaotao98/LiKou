package com.LiKou.simple.wuyuefen2022;

import java.util.*;

/**
 * 两句话中的不常见单词
 * <p>
 * 思路1：把字符串s1中每个单词一次次数存入到map1中，同理s2存到map2中，然后遍历map1，map2中所有的键，取出其中出现次数为1且只存在一个map中的字符串
 * <p>
 * 思路2：把两个字符串拼接，然后找出其中只出现过一次的字符串
 */
public class title884 {

    public static String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        String[] schar = (s1 + " " + s2).split(" ");
        for (int i = 0; i < schar.length; i++) {
            if (map.containsKey(schar[i])) {
                map.put(schar[i], map.get(schar[i]) + 1);
            } else {
                map.put(schar[i], 1);
            }
        }
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            if (map.get(s) == 1) {
                list.add(s);
            }
        }
        String[] rst = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            rst[i] = list.get(i);
        }
        return rst;
    }

    public static String[] uncommonFromSentences1(String s1, String s2) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        String[] s1char = s1.split(" ");
        for (int i = 0; i < s1char.length; i++) {
            if (map1.containsKey(s1char[i])) {
                map1.put(s1char[i], map1.get(s1char[i]) + 1);
            } else {
                map1.put(s1char[i], 1);
            }
        }
        Set<String> s1_keySet = map1.keySet();

        String[] s2char = s2.split(" ");
        for (int i = 0; i < s2char.length; i++) {
            if (map2.containsKey(s2char[i])) {
                map2.put(s2char[i], map2.get(s2char[i]) + 1);
            } else {
                map2.put(s2char[i], 1);
            }
        }
        Set<String> s2_keySet = map2.keySet();
        for (String s : s1_keySet) {
            if (map1.get(s) == 1 && !map2.containsKey(s)) {
                list.add(s);
            }
        }
        for (String s : s2_keySet) {
            if (map2.get(s) == 1 && !map1.containsKey(s)) {
                list.add(s);
            }
        }
        String[] rst = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            rst[i] = list.get(i);
        }
        return rst;
    }
}
