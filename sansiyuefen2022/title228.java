package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路：
 * 遍历数组，定义开始和结束指针，当符合条件时，执行while循环；判断start和end是否相等，相等，直接加入集合，不等，按要求加入集合。
 */
public class title228 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        List<String> list = summaryRanges(nums);
        System.out.println(list);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            int end;
            if (i == nums.length - 1) {
                list.add(String.valueOf(nums[i]));
                return list;
            }
            while (nums[i]+1 == nums[i + 1]) {
                i++;
                if (i == nums.length - 1) {
                    break;
                }
            }
             end = i;
            if (end == start) {
                list.add(String.valueOf(nums[i]));
            } else {
                list.add(nums[start] + "->" + nums[end]);
            }

        }
        return list;
    }
}
