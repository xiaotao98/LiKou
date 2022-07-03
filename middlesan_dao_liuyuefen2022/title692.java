package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.*;

/**
 * 前K个高频单词
 *
 * 思路：先把每个单词以及出现的次数存入到map中，将每个字符串存入到list中
 * 然后 第list进行一个排序（按照出现次数大小排，次数相等按照字典顺序排）
 */
public class title692 {
    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> list = topKFrequent(words, k);
        System.out.println(list);
    }

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();//将每个字符串以及对应的次数存入map中
        List<String> list = new ArrayList<>();//将每个字符串存入到list中
        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                list.add(w);
                map.put(w, 1);
            }
        }
        Collections.sort(list, (v1, v2) -> {
            int t1 = map.get(v1);
            int t2 = map.get(v2);
            if (t1 == t2) {
                return v1.compareTo(v2);//（让字典顺序小的排前面）返回的是v1第一个字母和v2第一个字母的差值
            }
            return t2 - t1;//让出现频率高的排前面（降序进行排序）
        });
        return list.subList(0, k);
    }
}
