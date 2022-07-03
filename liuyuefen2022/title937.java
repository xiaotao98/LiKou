package com.LiKou.simple.liuyuefen2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 重新排列日志文件
 * <p>
 * 思路：先将数字日志如出来放到list中，然后将字母日志取出来放到一个数组中，字母日志数组排序，然后将字母数组和数字日志集合中的元素放到原来的数组中去，即可。
 */
public class title937 {
    public static void main(String[] args) {
        String[] logs={"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        String[] s = reorderLogFiles(logs);
        for (String s1 : s) {
            System.out.println(s1);
        }
    }

    public static String[] reorderLogFiles(String[] logs) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            String[] s = logs[i].split(" ");
            if (Character.isDigit(s[1].charAt(0))) {//判断是否是数字日志
                list.add(logs[i]);
            }
        }
        String[] str_arr = new String[logs.length - list.size()];//保存所有的字母日志
        int k = 0;
        for (int i = 0; i < logs.length; i++) {
            String[] s = logs[i].split(" ");
            if (!Character.isDigit(s[1].charAt(0))) {//判断是否是字母日志
                str_arr[k] = logs[i];
                k++;
            }
        }
        //对字母日志排序
        Arrays.sort(str_arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o1_index = o1.indexOf(' ');
                String s1_left = o1.substring(0, o1_index);
                String s1_right = o1.substring(o1_index);

                int o2_index = o2.indexOf(' ');
                String s2_left = o2.substring(0, o2_index);
                String s2_right = o2.substring(o2_index);

                if (s1_right.equals(s2_right)) {//
                    return s1_left.compareTo(s2_left);
                }
                return s1_right.compareTo(s2_right);
            }
        });

        for (int i = 0; i < str_arr.length; i++) {
            logs[i] = str_arr[i];
        }
        for (int i = 0; i < list.size(); i++) {
            logs[i + str_arr.length] = list.get(i);
        }
        return logs;
    }
}
