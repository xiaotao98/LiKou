package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class title26 {
    public static void main(String[] args) {
        // method1();
        //method2();
        int nums[] = {1, 1,2, 2, 2, 3};
        int fast=0;
        int slow=0;

        while (fast<nums.length){
            if (nums[fast]!=nums[slow]){
                nums[slow+1]=nums[fast];
                slow++;
            }
            fast++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println("length:"+(slow+1));



    }

    private static void method2() {
        int nums[] = {1, 1,2, 2, 2, 3};

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
                if (nums[i]!=nums[index]){
                    nums[index+1]=nums[i];
                    index++;
                }
        }
        System.out.println("index "+(index+1));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static void method1() {
        int nums1[]={1,1,2,3,4,5,6,8,8,8,8};

        ArrayList list=new ArrayList();

        for (int i = 0; i < nums1.length; i++) {
            if (!list.contains(nums1[i])){
                list.add(nums1[i]);
            }
        }
        System.out.println(list);
    }
}
