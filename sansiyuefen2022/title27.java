package com.LiKou.simple.sansiyuefen2022;

public class title27 {
    public static void main(String[] args) {
        int nums[]={3,2,2,3,5,5,5,3,3};
        int val=3;
        int fast=0;
        int slow=0;

        while (fast<nums.length){
            if (nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }

        for (int num : nums) {
            System.out.println(num);
        }
//        System.out.println(slow);

    }

    public static int removeElement(int[] nums, int val) {
        int fast=0;
        int slow=0;
        for ( fast = 0; fast < nums.length; fast++) {
            if (nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
