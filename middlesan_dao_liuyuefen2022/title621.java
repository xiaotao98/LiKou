package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.Arrays;

/**
 * 任务调度器
 *
 * 思路：1、将任务按类型分组，正好A-Z用一个int[26]保存任务类型个数
 *      2、对数组进行排序  获得最大任务出现次数max  得到的时间至少为 count =（max-1）* (n+1) + 1
 *      3、再排序下一个任务，如果下一个任务B个数和最大任务数一致，count+1，否则，终止循环
 *      4、如果结果算出来，比数组长度还小，是不可能的。所以需要对数组长度和结果取一个最大值
 */
public class title621 {

    public int leastInterval(char[] tasks, int n) {
        int arr[] = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            arr[tasks[i] - 'A']++;
        }
        Arrays.sort(arr);
        int max=arr[arr.length - 1];//出现次数最多的任务次数
        int count = (max - 1) * (n + 1) + 1;//执行完出现次数最多的那个任务所需要的时间
        for (int i = arr.length - 2; i >= 0; i--) {//如果最大任务出现次数有相同的，那么执行时间需要加1
            if (arr[i] == max) {
                count++;
            } else {
                break;
            }
        }
        return Math.max(count, tasks.length);//如果结果算出来，比数组长度还小，是不可能的。因为可能有很多任务只出现1次
    }

}
