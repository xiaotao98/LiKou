package com.LiKou.simple.liuyuefen2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 最小绝对差
 * <p>
 * 思路：先对数组进行排序，找到最小绝对差min，然后再遍历数组，将绝对差为min的存到集合中
 */
public class title1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;//记录最小的绝对差
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] < min) {
                min = arr[i] - arr[i - 1];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == min) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i - 1]);
                temp.add(arr[i]);
                list.add(temp);
            }
        }
        return list;
    }

}
