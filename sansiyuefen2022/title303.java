package com.LiKou.simple.sansiyuefen2022;

public class title303 {
    public static void main(String[] args) {

    }

    int[] sums;

    public void NumArray(int[] nums) {
        int n = nums.length;
        sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];//因为sums是从1开始存的和
    }


//   上面法1   下面法2

    int[] nums;
    public void setNum1(int[] nums) {
        this.nums = nums;
    }
    public int sumRange1(int left, int right) {
        int total = 0;
        for (int i = left; i <= right; i++) {
            total += nums[i];
        }
        return total;
    }

}
