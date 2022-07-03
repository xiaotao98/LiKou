package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 电话号码的字母组合
 * <p>
 * 思路：把每个数字代表的字母存到字符串数组，然后逐个叠加字母
 */
public class title17 {
    public static void main(String[] args) {
        String digits = "7";
        List<String> list = letterCombinations(digits);
        System.out.println(list);
    }

    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.isEmpty()){
            return list;
        }
        String[] str = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < digits.length(); i++) {
            list = combine(list, str[digits.charAt(i) - '0' - 2]);//这里是关键   因为他数量会在原来的基础上变多  所以需要不断更新集合
        }
        return list;
    }

    private static List<String> combine(List<String> list, String s) {
        List<String> temp=new ArrayList<>();
        if (list.size()==0){
            for (int i = 0; i < s.length(); i++) {//添加第一个数字代表的字母
                temp.add(s.charAt(i)+"");
            }
        }else {
            for (int i = 0; i < list.size(); i++) {
                String s1 = list.get(i);
                for (int j = 0; j < s.length(); j++) {
                    temp.add(s1+s.charAt(j));
                }
            }
        }
        return temp;
    }
}
