package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 *
 * 思路：把数组中的所有数字都存入到list中，然后遍历0-nums.length,如果list集合没有包含这个数，则就是那个丢失的数字
 */
public class title268 {
    public static void main(String[] args) {
        int nums[] = {0};
        int result = missingNumber(nums);
        System.out.println(result);
    }

    //自己的思路
    public static int missingNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {//把数组中的元素都存入到list中
            list.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    /**
     * 官方思路   也是很妙
     * @param nums
     * @return
     */
    public static int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

}
