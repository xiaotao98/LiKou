package com.LiKou.simple.sansiyuefen2022;

public class title53 {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int max=nums[0];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {//遍历数组
            if (sum>0){//如果和大于0  则加上遍历的数字  即使num<0 允许其有部分容错
                sum=sum+nums[i];
            }else {//sum<0  子数组重新开始
                sum=nums[i];
            }
            max=Math.max(sum,max);
        }

        System.out.println(max);

    }
}
