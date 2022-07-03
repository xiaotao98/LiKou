package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 颜色分类
 *
 * 思路：冒泡   快排
 */
public class title75 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 4, 5, 1};
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    /**
     * 快速排序 首先找最小的
     */
    public static void sortColors(int[] nums) {
        kuaipai(nums, 0, nums.length - 1);
    }

    public static void kuaipai(int[] nums, int left, int right) {
        if (left > right) {//必写  递归终止条件
            return;
        }
        int left0 = left;
        int right0 = right;
        int jizhun = nums[left0];
        while (left != right) {//必须是不等
            while (nums[right] >= jizhun && left < right) {
                right--;
            }
            while (nums[left] <= jizhun && left < right) {
                left++;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        int temp = nums[left0];
        nums[left0] = nums[left];
        nums[left] = temp;
        kuaipai(nums, left0, left - 1);
        kuaipai(nums, left + 1, right0);

    }

    /**
     * 冒泡排序 首先找最小的
     */
    public static void sortColors2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
