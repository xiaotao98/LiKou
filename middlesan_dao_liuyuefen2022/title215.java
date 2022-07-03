package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 排序算法
 */
public class title215 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        //int result = findKthLargest(nums, 4);
        //System.out.println(result);
        int[] maopao = kuaipai(nums, 0, nums.length - 1);
        for (int i = 0; i < maopao.length; i++) {
            System.out.println(maopao[i]);
        }
    }

    public static int findKthLargest(int[] nums, int k) {
        int[] maopao = maopao(nums);
        return maopao[maopao.length - k];

    }

    /**
     * 快排  时间复杂度  O(nlogn)
     */
    public static int[] kuaipai(int[] nums, int left, int right) {
        if (left > right) {//必写  递归终止条件
            return null;
        }
        int left0 = left;
        int right0 = right;
        int basenum = nums[left0];//记录基准数字
        while (left != right) {
            while (nums[right] >= basenum && left < right) {//必须先从右边找小的
                right--;
            }
            while (nums[left] <= basenum && left < right) {//再从左边找大的
                left++;
            }
            //交换数字
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        //基准数归位
        int temp = nums[left];
        nums[left] = nums[left0];
        nums[left0] = temp;

        kuaipai(nums, left0, left - 1);
        kuaipai(nums, left + 1, right0);

        return nums;
    }

    /**
     * 冒泡排序  时间复杂度  O(n^2)
     */
    public static int[] maopao(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
