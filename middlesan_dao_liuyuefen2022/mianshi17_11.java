package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 单词距离
 * <p>
 * 思路：暴力解法   遍历数组，将单词1和单词2出现的下标分别存到list1，list2中，然后取两个集合的最小差值
 */
public class mianshi17_11 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);


    }

    public static int findClosest(String[] words, String word1, String word2) {
        int min = words.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                list1.add(i);
            }
            if (words[i].equals(word2)) {
                list2.add(i);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                int abs = Math.abs(list1.get(i) - list2.get(j));
                if (abs < min) {
                    min = abs;
                }
            }
        }
        return min;
    }
}
