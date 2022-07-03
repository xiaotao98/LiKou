package com.LiKou.simple.sansiyuefen2022;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 字符串中的第一个唯一字符
 *
 * 思路1：利用字符串分割  效率低
 *
 * 思理2 利用map
 */
public class title387 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int i = firstUniqChar(s);
        System.out.println(i);
    }

    public static int firstUniqChar(String s) {
        char[] schars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        //把每个字母和他出现的次数存入到hashmap中
        for (int i = 0; i < schars.length; i++) {
            if (!map.containsKey(schars[i])) {
                map.put(schars[i], 1);
            } else {
                map.put(schars[i], -1);
            }
        }

        //从头遍历字符串，找到首次出现次数为1的，就是需要返回的索引，如果没有 返回-1
        for (int i = 0; i < schars.length; i++) {
            if (map.get(schars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

}
