package com.LiKou.simple.wuyuefen2022;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 找重复的数字  以及丢失的数字
 */
public class title645 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] errorNums = findErrorNums(nums);
        for (int errorNum : errorNums) {
            System.out.println(errorNum);
        }
    }

    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i++) {//找到重复数字
            if (nums[i] == nums[i + 1]) {
                arr[0] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {//把数字都存入到set中
            set.add(nums[i]);
        }

        int i = 1;
        for (Integer integer : set) {
            if (integer != i) {//找到丢失的数字
                arr[1] = i;
                break;
            }
            i++;
        }
        if ( arr[1] == 0){//说明没有找到丢失的数字，则丢失的数字是最后一个
            arr[1] = set.size()+1;
        }
        return arr;
    }
}
