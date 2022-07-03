package com.LiKou.simple.sansiyuefen2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class title389 {
    public static void main(String[] args) {
        String s = "";
        String t = "y";
        char c = findTheDifference(s, t);
        System.out.println(c);
    }

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        //先把t的每个字母以及次数都存入到map集合中去
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), 1);
            } else {
                Integer old = map.get(t.charAt(i));
                map.put(t.charAt(i), old + 1);
            }
        }
        //遍历s的每个字母，获得map中对应的值，如果值是>1的，让其值-1，当值为1，就删除这个键值对
        //这样下去  最后map中只会剩下一个键值对，取出其中的键，就是结果
        for (int i = 0; i < s.length(); i++) {
            Integer old = map.get(s.charAt(i));
            if (old > 1) {
                map.put(s.charAt(i), old - 1);
            } else {
                map.remove(s.charAt(i));
            }
        }
        Set<Character> keySet = map.keySet();
        for (Character character : keySet) {
            return character;
        }
        return '0';
    }
}
