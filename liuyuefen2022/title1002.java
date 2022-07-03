package com.LiKou.simple.liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 查找共用字符
 * <p>
 * 思路：利用数组记录每个字符出现的次数   首先用数组arr记录第一个字符串，然后遍历字符串数组，用一个新的数组temp记录新的一个字符串字符；
 * 然后更新数组arr的数值  取两者较小的那个数值   重复上述步骤。最后   遍历数组arr  将不为0的加入到list中，注意转为char和string
 */
public class title1002 {

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        List<String> list = commonChars(words);
        System.out.println(list);
    }

    public static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int[] arr_0 = new int[26];//记录第一个字符串所有字符出现的次数
        char[] chars = words[0].toCharArray();
        for (int i = 0; i < chars.length; i++) {
            arr_0[chars[i] - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] temp = new int[26];//记录一个字符串所有字符出现的次数
            char[] chars1 = words[i].toCharArray();
            for (int j = 0; j < chars1.length; j++) {
                temp[chars1[j] - 'a']++;
            }
            for (int k = 0; k < arr_0.length; k++) {
                arr_0[k] = Math.min(arr_0[k], temp[k]);//更新arr_0  取最小值
            }
        }
        for (int i = 0; i < arr_0.length; i++) {
            if (arr_0[i] > 0) {
                for (int j = 0; j < arr_0[i]; j++) {
                    list.add((char) (i + 'a') + "");
                }
            }
        }
        return list;
    }

}
