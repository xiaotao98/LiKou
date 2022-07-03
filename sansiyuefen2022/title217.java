package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 数组中有重复元素：返回true，否则 返回false
 * 利用Set集合的特性：去除重复
 * 将数组中的数值都存到set集合中，看集合长度是否=数组长度
 * 相等，则说明没有重复值
 *
 * 更优思路：set添加失败，说明有重复的，就直接返回true
 */
public class title217 {
    public static void main(String[] args) {

    }

    public static boolean containsDuplicate1(int[] nums) {
        Set set = new HashSet();
        for (int num : nums) {
          if (!set.add(num)) {
              return true;
          }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Set set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() == nums.length) {
            return false;
        } else {
            return true;
        }
    }

    //用这个方法会超时
    public static boolean containsDuplicate3(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        if (list.size() == nums.length) {
            return false;
        } else {
            return true;
        }
    }

}
