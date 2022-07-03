package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.Arrays;

/**
 * 摆动排序 II
 * <p>
 * 思路：先排序，然后利用穿插思想   一小一大的排   小的从mid开始，大的从末尾开始  小=(arr.length-1)/2   大=arr.length-1
 */
public class title324 {

    public static void wiggleSort(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        int mid = (nums.length - 1) / 2, right = arr.length - 1;
        int index = 0;
        while (mid >= 0 && right > (nums.length - 1) / 2) {//注意right必须大于mid的起点位置
            nums[index] = arr[mid];
            index++;
            nums[index] = arr[right];
            index++;
            mid--;
            right--;
        }
        while (mid >= 0) {
            nums[index] = arr[mid];
            mid--;
        }
    }

}
