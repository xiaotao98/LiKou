package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 寻找重复数字
 * <p>
 * 思路1：转变为快慢指针问题
 * <p>
 * 思路2：给出现过的数字 代表的下标标为负数   如果遍历到的那个数字代表的下标为负数   就返回
 */
public class title287 {

    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 2, 2};
        int i = findDuplicate1(nums);
        System.out.println(i);
    }

    public static int findDuplicate1(int[] nums) {
        int slow = 0;
        int fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int p1=0;
        int p2=slow;
        while (p1!=p2){
            p1=nums[p1];
            p2=nums[p2];
        }
        return p1;
    }

    public static int findDuplicate2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int abs = Math.abs(nums[i]);
            if (nums[abs] < 0) {
                return abs;
            } else {
                nums[abs] = -1 * nums[abs];
            }
        }
        return 0;
    }

}
