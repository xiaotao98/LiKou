package com.LiKou.simple.sansiyuefen2022;

/**
 * 字符串中的单词数
 *
 * 思路：按空格分，只要不为空，就算一个长度
 */
public class title434 {
    public static void main(String[] args) {
        String s=", , , , a, eaefa";
        int i = countSegments(s);
        System.out.println(i);
    }
    public static int countSegments(String s) {
        int i=0;
        String[] split = s.split(" ");
        for(String s1:split){
            if(s1.length()!=0){
                i++;
            }
        }
        return i;
    }
}
