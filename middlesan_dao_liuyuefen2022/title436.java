package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *  寻找右区间
 *
 *  用数组存二维数组第一列，用map存二维数组第一列以及对应的下标   然后将数组排序  并且取出来数组最后一个max数
 *  拿每一个区间的right数去和max比较，如果大于max  说明右区间不存在  直接-1
 *  否则存在，那么就去数组中用二分法查找那个符合要求的数字，找到之后，再去map中取下标   即可
 */
public class title436 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {2, 3}, {3, 4}};
        int[] arr = findRightInterval(intervals);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] findRightInterval(int[][] intervals) {
        int x = intervals.length;
        int y = intervals[0].length;
        Map<Integer, Integer> map = new HashMap<>();// 存第一列的数据以及他的下标
        int[] yilie = new int[x]; // 存第一列的数据
        int[] rst = new int[x];
        for (int i = 0; i < x; i++) {
            yilie[i] = intervals[i][0];
            map.put(intervals[i][0], i);
        }
        Arrays.sort(yilie);
        int yilie_max = yilie[yilie.length - 1];

        for (int i = 0; i < rst.length; i++) {
            if (intervals[i][1] <= yilie_max) {// 说明右区间存在，则需要判断最小符合要求的那个点，然后取map中找到下标
                int aid_num = find_aid(yilie, intervals[i][1]);// 调用函数去找符合要求的那个数
                rst[i] = map.get(aid_num);// 去map中取下标
            } else {// 右区间不存在
                rst[i] = -1;
            }
        }
        return rst;
    }

    // 用二分法去找符合要求的最小的那个数
    public static int find_aid(int nums[], int x) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == x) {
                return nums[mid];
            }
            if (nums[mid] > x) {
                right = mid - 1;
            }
            if (nums[mid] < x) {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
