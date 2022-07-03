package com.LiKou.simple.sansiyuefen2022;

import java.util.*;

public class title448 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = findDisappearedNumbers(nums);
        System.out.println(list);
    }

    /**
     * 暴力解法  就是  1个1个的去尝试，
     *
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();   //用ArrayList就会超时
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    /**
     * 法二：   思路：创立一个新的数组，然后把出现的那个元素的索引值设为1，最后遍历新数组，元素值为0的就是需要求的
     *
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] newArr = new int[nums.length + 1];
        for (int num : nums) {
            newArr[num] = 1;
        }
        for (int i = 1; i < newArr.length; i++) {  //注意从1开始   0肯定为0
            if (newArr[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
