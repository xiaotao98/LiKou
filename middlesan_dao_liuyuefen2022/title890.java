package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 查找和替换模式
 * <p>
 * 思路：先将替换模式  转成固定的格式，然后将字符串数组中每个字符串和那个格式比较，相同的加入list，即可。
 */
public class title890 {

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        String jizhun = match(pattern);
        for (int i = 0; i < words.length; i++) {
            if (match(words[i]).equals(jizhun)) {
                list.add(words[i]);
            }
        }
        return list;
    }

    public static String match(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), k);
                k++;
            }
            sb.append(map.get(s.charAt(i)));
        }
        return sb.toString();
    }

}
