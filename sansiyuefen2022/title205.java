package com.LiKou.simple.sansiyuefen2022;

import java.util.HashMap;
import java.util.Map;

/**
 * 同构字符串：判断两个字符串是否能一一映射
 *
 * 思路:构造一个map集合，如果集合包含s.charAt(i)这个键，则去判断此时对应的t.charAt(i)是否和原来的值相等，不等 返回false
 * 如果集合不包含s.charAt(i)这个键，判断集合是否包含t.charAt(i)这个值，若包含，说明现在的键肯定和原来的键不通，返回false
 * 否则，将这个新的键值对加入map集合中
 */
public class title205 {
    public static void main(String[] args) {
       String s = "abc", t = "aab";
        boolean result = isIsomorphic(s, t);
        System.out.println(result);
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {//集合包含了键，则判断键值是否匹配
                Character olds = map.get(s.charAt(i));
                if (olds != t.charAt(i)) {//键值不匹配
                    return false;
                }
            } else {
                if (map.containsValue(t.charAt(i))){//如果集合含有这个值，却没有这个列，肯定不是相同的key
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;

    }
}
