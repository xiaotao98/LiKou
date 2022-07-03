package com.LiKou.simple.wuyuefen2022;

import java.util.HashMap;
import java.util.Map;

/**
 * 最短补全词
 *
 * 思路：先去字符串中提取所有的字母，然后转为小写，得到一个新的字符串newstr，然后拿newstr和字符串数组中的每一个去比较，看newstr是否符合要求，并且记录符合要求的下标
 */
public class title748 {
    public static void main(String[] args) {
        String[] words = {"looks", "pest", "stew", "show"};
        String licensePlate = "1s3 456";
        String string = shortestCompletingWord(licensePlate, words);
        System.out.println(string);
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < licensePlate.length(); i++) {
            if ((licensePlate.charAt(i) >= 'a' && licensePlate.charAt(i) <= 'z')
                    || (licensePlate.charAt(i) >= 'A' && licensePlate.charAt(i) <= 'Z')) {
                sb.append(licensePlate.charAt(i));// 先收集所有的字母
            }
        }
        int min_len = Integer.MAX_VALUE;
        int index = -1;
        String new_strString = sb.toString().toLowerCase();// 注意全部转为小写
        for (int i = 0; i < words.length; i++) {
            boolean bool = judge(new_strString, words[i]);
            if (bool && words[i].length() < min_len) {// 说明符合要求，则需要记录长度和下标
                min_len = words[i].length();
                index = i;
            }
        }
        return words[index];

    }

    // 判断字a是否出现在b中
    public static boolean judge(String a, String b) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.get(b.charAt(i)) + 1);
            } else {
                map.put(b.charAt(i), 1);
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                if (map.get(a.charAt(i)) == 1) {
                    map.remove(a.charAt(i));// 数量为1的话直接就删除了
                } else {
                    map.put(a.charAt(i), map.get(a.charAt(i)) - 1);// 数量大于1的话让其减一
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
