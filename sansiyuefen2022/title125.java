package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 回文数：
 * 思路：字符串转为字节数组，把英文和数字加到集合list<string>中去，然后定义一个左右指针，判断是否相等。
 */
public class title125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean bool = isPalindrome(s);
        System.out.println(bool);
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        boolean bool=true;

        List<String> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z') || (chars[i] >= '0' && chars[i] <= '9')) {
                list.add(String.valueOf(chars[i]));
            }
        }

        if (list.size()==1){
            return true;
        }

        int left = 0;
        int right = list.size()-1;

        while (left<right){
            if (list.get(left).equalsIgnoreCase(list.get(right))){
                left++;
                right--;
            }else {
                bool=false;
                break;
            }
        }


        return bool;
    }
}
