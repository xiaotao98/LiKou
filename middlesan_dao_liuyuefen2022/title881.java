package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.Arrays;

/**
 * 救生艇
 *
 * 思路：先让数组排序，定义前后两个指针，如果说两者值加起来小于等于limit，则两个人一个船，否则，让大的一个船
 */
public class title881 {
    public static void main(String[] args) {
        int[] people={3,5,3,4};
        int limit=5;
        int i = numRescueBoats(people, limit);
        System.out.println(i);
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1;
        int count=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                count++;
                i++;
                j--;
            }else{
                count++;
                j--;
            }
        }
        return count;
    }
}
