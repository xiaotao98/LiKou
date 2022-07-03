package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 *  两个数组的交集
 *
 *  思路：暴力解法：遍历第一个数组中的每一个值，然后遍历第二个数组每一个数值
 *    当找到相同的两个数值时，将他加入list集合，然后更改第二个数组此次替换的数字（这是为了避免相同数字出现次数不一致的情况），并且终止此次循环
 *    最后，将list集合中的数都存到一个新的数组，即可
 */
public class title350 {
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2};
        int[] i = intersect(nums1, nums2);
        for (int i1 : i) {
            System.out.println(i1);
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] ) {//找到相同的元素
                    list.add(nums1[i]);
                    nums2[j]=1001;//把第二个数组已经相同的数给  去掉，避免找到相同的重复数字
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
