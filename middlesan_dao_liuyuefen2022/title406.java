package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 根据身高重建队列
 * <p>
 * 思路：先对二维数组people进行排序，第一列升序，第二列降序排列   新建一个总人数数组  比如6个人  arr[]={0，1，2，3，4，5}
 * 遍历数组people  x=people[i][1]  去arr中寻找合理下标(元素不为-1才算一个合理下标)为x的那个元素y   y就是people[i]正确的位置  再将y设为-1
 */
public class title406 {

    public static int[][] reconstructQueue(int[][] people) {
        int[][] rst = new int[people.length][people[0].length];
        Arrays.sort(people, new Comparator<int[]>() {//对二维数组排序
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o2[1] - o1[1];//对第一列元素相同   第二列元素进行降序排列
                }
                return o1[0] - o2[0];//对第一列元素进行升序排列
            }
        });
        int arr[] = new int[people.length];
        for (int i = 0; i < people.length; i++) {//总人数数组
            arr[i] = i;
        }
        for (int i = 0; i < people.length; i++) {
            int xiabiao = people[i][1];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != -1) {//先判断这个下标是否用过
                    if (count == xiabiao) {//寻找下标
                        rst[arr[j]] = people[i];
                        arr[j] = -1;//用过的数值把他设为-1，下次计算下标时，这个值跳过
                        break;
                    }
                    count++;
                }
            }
        }
        return rst;
    }

}
