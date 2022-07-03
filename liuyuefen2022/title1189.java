package com.LiKou.simple.liuyuefen2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * “气球” 的最大数量
 * <p>
 * 思路：把和气球相关的单词存到map中，然后取其中的最小值，注意，有的单词需要除以2再取  最小值
 */
public class title1189 {
    public static void main(String[] args) {
        String text = "nlaebolko";
        int i = maxNumberOfBalloons(text);
        System.out.println(i);
    }

    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            }
        }
        int min = text.length();//记录map中的最小值
        Set<Character> keySet = map.keySet();
        for (Character c : keySet) {
            Integer value = map.get(c);
            if (c == 'l' || c == 'o') {
                value = value / 2;//这是因为需要两个字母才能组成一个单词
            }
            min = Math.min(min, value);
        }
        return min;
    }
}
