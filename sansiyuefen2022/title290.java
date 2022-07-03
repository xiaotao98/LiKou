package com.LiKou.simple.sansiyuefen2022;

import java.util.HashMap;
import java.util.Map;

public class title290 {
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat fish";
        boolean bool = wordPattern(pattern, s);
        System.out.println(bool);
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        if (split.length!=pattern.length()){//两个长度不等  返回false
            return false;
        }
        char[] chars = pattern.toCharArray();
        Map<Character,String> map=new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])){//不存在的键,先判断是否有值，有返回false，否则，直接加入到map中
                if (map.containsValue(split[i])){//键不存在，值却存在，也返回false
                    return false;
                }else {
                    map.put(chars[i],split[i]);
                }
            }else {
                if (!map.get(chars[i]).equals(split[i])){//键值不匹配，返回false
                    return false;
                }
            }
        }
        return true;
    }
}
