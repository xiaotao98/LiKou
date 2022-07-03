package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 下一个排列
 *
 * 思路：从后往前找，直到找到arr[i]>arr[i-1]的位置 ，令aid=i-1,如果没找到，说明数组是降序，直接返回倒序。
 *      否则将遍历过的部分那个比arr[aid]大的最小值和aid位置交换，然后将位置aid+1到最后进行一个倒序即可。
 */
public class title31 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 5};
        nextPermutation(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void nextPermutation(int[] nums) {
        boolean flag = true;
        int aid = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                aid = i - 1;
                flag = false;
                break;
            }
        }
        if (flag) {//flag为true的话，说明数组是降序排列，直接反转数组即可
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for (int i = nums.length - 1; i > aid; i--) {
            if (nums[i] > nums[aid]) {//将遍历过的部分那个比i-1大的最小值和i-1位置交换
                int temp = nums[i];
                nums[i] = nums[aid];
                nums[aid] = temp;
                break;
            }
        }
        reverse(nums, aid + 1, nums.length - 1);//将位置aid+1到最后进行一个倒序即可
        return;
    }

    //反转数组
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
