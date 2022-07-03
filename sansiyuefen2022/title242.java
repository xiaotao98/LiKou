package com.LiKou.simple.sansiyuefen2022;

import java.util.HashMap;
import java.util.Map;

/**
 * 判断两个字符串中的每个字母出现的次数是否相等。
 *
 * 思路：把第一个字符串每个字符出现的次数存入到map集合中
 * 然后遍历第二个字符串，碰到相同的就-1，碰到没有的就返回false，当值-1为0了就直接删除掉这个节点。
 */
public class title242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean bool = isAnagram(s, t);
        System.out.println(bool);
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] sArrays = s.toCharArray();
        for (int i = 0; i < sArrays.length; i++) {//每个字符出现的次数存入到map集合中
            if (!map.containsKey(sArrays[i])) {
                map.put(sArrays[i], 1);
            } else {
                Integer old = map.get(sArrays[i]);
                map.put(sArrays[i], old + 1);
            }
        }

        char[] tArrays = t.toCharArray();
        for (int j = 0; j < tArrays.length; j++) {
            if (!map.containsKey(tArrays[j])) {//没有对应的键，返回false
                return false;
            } else {
                Integer old = map.get(tArrays[j]);//得到对应的键的值
                if (old <= 0) {//值为负数，返回false
                    return false;
                }
                if (old - 1 == 0) {//值为0删除该键
                    map.remove(tArrays[j]);
                }else {
                    map.put(tArrays[j], old - 1);//值大于1时，让该值-1
                }
            }
        }
        if (map.size() != 0) {//如果字母出现字数相等，那么集合就为空了，所以集合不空，返回false
            return false;
        }
        return true;
    }
}
