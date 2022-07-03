package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 *  两个数组的交集
 *
 *  思路：暴力解法：遍历第一个数组中的每一个值，然后遍历第二个数组每一个数值
 *  当找到相同的两个数值时，而且list集合中没有，将将他加入list集合，并且终止此次循环
 *  最后，将list集合中的数都存到一个新的数组，即可
 */
public class title349 {
    public static void main(String[] args) {
        int nums1[] = {4, 9, 5};
        int nums2[] = {9, 4, 9, 8, 4};
        int[] i = intersection(nums1, nums2);
        for (int i1 : i) {
            System.out.println(i1);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !list.contains(nums1[i])) {//找到相同的元素，而且list集合中没有
                    list.add(nums1[i]);
                    break;
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
