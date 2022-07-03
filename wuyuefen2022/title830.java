package com.LiKou.simple.wuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 较大分组的位置
 *
 * 思路：双指针的思想，结尾需要单独判断
 */
public class title830 {

    public static void main(String[] args) {
        String s = "abbxxxxzzy";
        List<List<Integer>> list = largeGroupPositions(s);
        System.out.println(list);
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        char[] charArray = s.toCharArray();
        if (s.length() <= 2) {
            return list;
        }
        char com = s.charAt(0);
        int start = 0;
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] != com) {
                if (i - 1 - start >= 2) {//这种情况是到i出现不通的字符，判断长度要i-1
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(start);
                    list1.add(i - 1);
                    list.add(list1);
                }
                com = charArray[i];
                start = i;
            }
            if (i == charArray.length - 1) {//这个是判断最后一段是否符合条件,判断长度要i不要-1
                if (i - start >= 2) {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(start);
                    list1.add(i);
                    list.add(list1);
                }
                com = charArray[i];
                start = i;
            }
        }
        return list;
    }
}
