package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 判断数组中每个元素  是否在键盘的同一行
 *
 * 思路：利用 string包含
 */
public class title500 {
    public static void main(String[] args) {
        String[] word={"Hello","Alaska","Dad","Peace"};
        String[] words = findWords(word);
        for (String s : words) {
            System.out.println(s);
        }
    }

    public static String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";//键盘第1行
        String s2 = "asdfghjklASDFGHJKL";//键盘第2行
        String s3 = "zxcvbnmZXCVBNM";//键盘第3行

        List<String> list=new ArrayList<>();//用来保存符合条件的字符串
        for (int i = 0; i < words.length; i++) {
            int n1 = 0, n2 = 0 , n3 = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (s1.contains(words[i].charAt(j)+"")){//判断字符在哪一行
                    n1++;
                }else if (s2.contains(words[i].charAt(j)+"")){
                    n2++;
                }else {
                    n3++;
                }
            }
            if (n1 == words[i].length() || n2 == words[i].length() || n3 == words[i].length()){//看是否符合条件
                list.add(words[i]);
            }
        }
        String[] result=new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i]=list.get(i);
        }
        return result;
    }
}
