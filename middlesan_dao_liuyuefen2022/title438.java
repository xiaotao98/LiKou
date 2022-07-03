package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.*;

/**
 * 找到字符串中所有字母异位词
 * <p>
 * 思路1：滑动窗口 + 数组;维护数组内各个元素的数量，和p比较
 * <p>
 * 思路2：滑动窗口 + hashmap;维护数组内各个元素的数量，和p比较    两种方法都需要  判断两者的长度   因为字符串1长度小会出错
 */
public class title438 {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int s_len = s.length();
        int p_len = p.length();
        if (s_len < p_len) {
            return list;
        }
        int[] s_arr = new int[26];
        int[] p_arr = new int[26];
        for (int i = 0; i < p_len; i++) {//判断第一个长度
            p_arr[p.charAt(i) - 'a']++;
            s_arr[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(p_arr, s_arr)) {
            list.add(0);
        }
        for (int i = p_len; i < s.length(); i++) {
            s_arr[s.charAt(i) - 'a']++;//移动右指针
            s_arr[s.charAt(i - p_len) - 'a']--;//移动给左指针
            if (Arrays.equals(p_arr, s_arr)) {
                list.add(i - p_len + 1);//添加起始点
            }
        }
        return list;
    }

    public static List<Integer> findAnagrams2(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length()) {
            return list;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }
        Map<Character, Integer> temp_map = new HashMap<>();
        String substring = s.substring(0, p.length());
        for (int j = 0; j < substring.length(); j++) {
            temp_map.put(substring.charAt(j), temp_map.getOrDefault(substring.charAt(j), 0) + 1);
        }
        if (temp_map.equals(map)) {
            list.add(0);
        }
        for (int i = p.length(); i < s.length(); i++) {
            temp_map.put(s.charAt(i - p.length()), temp_map.get(s.charAt(i - p.length())) - 1);
            if (temp_map.get(s.charAt(i - p.length())) == 0) {
                temp_map.remove(s.charAt(i - p.length()));
            }
            temp_map.put(s.charAt(i), temp_map.getOrDefault(s.charAt(i), 0) + 1);
            if (temp_map.equals(map)) {
                list.add(i - p.length() + 1);
            }
        }
        return list;
    }

}
