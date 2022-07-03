package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数组中重复的数据
 *
 * 遍历数组  没有出现  存入到map中  出现过，说明是我们需要找的数据加入到list集合中去即可
 */
public class title442 {
    public static void main(String[] args) {

    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                list.add(nums[i]);
            }else {
                map.put(nums[i],1);
            }
        }
        return list;
    }

    /**
     *这个方法超时了
     */
    public static List<Integer> findDuplicates2(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        return list;
    }
}
