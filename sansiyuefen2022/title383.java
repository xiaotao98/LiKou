package com.LiKou.simple.sansiyuefen2022;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 思路：将第一个字符串每个字母和他出现的次数存入到map集合中
 * 然后，遍历第二个字符串，每出现一个相同的键，map中的数量-1，当map数量减为0  删除那个键值对
 * 如果 map变为空了  说明可以  否则 说明不可以
 */
public class title383 {
    public static void main(String[] args) {
        String s="aa";
        String m="aab";
        boolean bool = canConstruct(s, m);
        System.out.println(bool);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> amap = new HashMap<>();

        char[] achar = ransomNote.toCharArray();
        char[] bchar = magazine.toCharArray();
        for (int i = 0; i < achar.length; i++) {
            if (!amap.containsKey(achar[i])) {
                amap.put(achar[i], 1);
            } else {
                Integer old = amap.get(achar[i]);
                amap.put(achar[i], old + 1);
            }
        }

        for (int i = 0; i < bchar.length; i++) {
            if (amap.containsKey(bchar[i])) {
                Integer old = amap.get(bchar[i]);
                if (old>1){
                    amap.put(bchar[i], old - 1);
                }else {
                    amap.remove(bchar[i]);
                    if (amap.isEmpty()){
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
