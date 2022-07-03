package com.LiKou.simple.sansiyuefen2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 相对名次
 *
 * 思路：用map存相对名字，比如   1-》金牌   2-》银牌 3-》铜牌   4-》4.。。。
 * 然后复制一个新的数组并且排序    遍历旧的数组，去新的数组里面找相等的下标   数组长度-新数组下标即为名次
 * 根据   名次   去map中找对应的编号
 */
public class title506 {
    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
        String[] s = findRelativeRanks(score);
        for (String s1 : s) {
            System.out.println(s1);
        }

    }

    public static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        int length = score.length;
        Map<Integer, String> map = new HashMap<>();
        //用map把对应名字显示的编号存入到mao中
        for (int i = 1; i <= length; i++) {
            if (i == 1) {
                map.put(i, "Gold Medal");
            } else if (i == 2) {
                map.put(i, "Silver Medal");
            } else if (i == 3) {
                map.put(i, "Bronze Medal");
            } else {
                map.put(i, i + "");
            }
        }
        int[] newscore = score.clone();//复制一个数组
        Arrays.sort(newscore);//给新数组排序
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < newscore.length; j++) {
                if (score[i] == newscore[j]) {
                    result[i] = map.get(newscore.length - j);  //数组从小到大排序，长度-下标=名次
                    break;
                }
            }
        }
        return result;
    }
}
