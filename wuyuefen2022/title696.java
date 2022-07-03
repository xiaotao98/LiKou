package com.LiKou.simple.wuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串s，统计并返回具有相同数量 0 和 1 的非空（连续）子字符串的数量，并且这些子字符串中的所有 0 和所有 1 都是成组连续的。
 * 重复出现（不同位置）的子串也要统计它们出现的次数。
 *
 * 思路：比如字符串100011   我需要先统计字符串中的连续0和1的个数存入到list中   比如这里是 1，3，2
 * 然后取这些相邻数中较小的一个进行一个求和即可   即  1+2=3
 */
public class title696 {
    public static void main(String[] args) {
        String s = "100011";
        int i = countBinarySubstrings(s);
        System.out.println(i);
    }


    public static int countBinarySubstrings(String s) {
        List<Integer> list=new ArrayList<>();
        int num=1;
        for (int i = 0; i < s.length(); i++) {//list中存的是连续1和0的个数
            if (i!=s.length()-1) {
                if (s.charAt(i)==s.charAt(i+1)) {
                    num++;
                }else {
                    list.add(num);
                    num=1;
                }
            }else {
                list.add(num);
            }
        }
        int sum=0;
        for (int i = 0; i < list.size()-1; i++) {//将list中两两相邻的数字 取其中较小的一个相加
            if (list.get(i)<list.get(i+1)) {
                sum=sum+list.get(i);
            }else {
                sum=sum+list.get(i+1);
            }
        }
        return sum;
    }

    /**
     *这个暴力搜索的方法焯熟了时间限制
     */
    public static int countBinarySubstrings2(String s) {
        int count = 0;// 统计符合要求的字串数量
        List<String> ziChuang = countZiChuang(s);// 判断里面的字符串0和1是否连续就可以了
        for (int i = 0; i < ziChuang.size(); i++) {
            String string = ziChuang.get(i);
            int num = 0;
            for (int j = 0; j < string.length() / 2; j++) {
                if (string.charAt(0) == string.charAt(j)) {// 看是否连续
                    num++;
                }
            }
            if (num == string.length() / 2) {// 如果连续 count++
                count++;
            }
        }
        return count;
    }

    // 计算字符串中的所有为偶数长度且0 1相等的字串字串
    public static List<String> countZiChuang(String s) {
        List<String> list = new ArrayList<String>();
        String ss;
        for (int i = 0; i < s.length(); i++) {
            ss = s.substring(i);
            for (int j = 0; j < ss.length(); j++) {
                if (ss.substring(0, j + 1).length() % 2 == 0) {
                    int a0 = 0;// 0的个数
                    int a1 = 0;// 1的个数
                    for (int x = 0; x < ss.substring(0, j + 1).length(); x++) {
                        if (ss.substring(0, j + 1).charAt(x) == '0') {
                            a0++;
                        } else {
                            a1++;
                        }
                    }
                    if (a0 == a1) {// 0和1的个数相等
                        list.add(ss.substring(0, j + 1));
                    }
                }
            }
        }
        return list;
    }
}
