package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * <p>
 * 思路：用i从头到length-2遍历数组   然后利用双指针的思想  sum = nums[i] + nums[left] + nums[right]
 * 如果相等  加入集合  sum>0 right--,sum<0 left++
 */
public class title15 {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length <= 2) {//数组长度小于3直接返回
            return list;
        }
        Arrays.sort(nums);//数组排序
        for (int i = 0; i < nums.length - 2; i++) {//确保有三个数相加
            int left = i + 1, right = nums.length - 1;//左右两个指针
            while (left < right) {//相当于确定一个数nums[i],然后找所有符合条件的另外两个数
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {//sum为0的情况
                    List<Integer> list2 = new ArrayList<>();
                    list2.add(nums[i]);
                    list2.add(nums[left]);
                    list2.add(nums[right]);
                    if (!list.contains(list2)) {
                        list.add(list2);
                    }
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return list;
    }

}
