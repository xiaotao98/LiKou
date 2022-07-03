package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 求数组的所有不重复的子集
 *
 * 1 扩展法
 *
 * 2回溯法
 */
public class title78 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = subsets(nums);
        System.out.println(list);

    }
//方法一
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());//空集合是必定存在的
        for (int i = 0; i < nums.length; i++) {
            int len = list.size();
            for (int j = 0; j < len; j++) {
                List<Integer> temp = new ArrayList<>(list.get(j));//取出结果集中每个子集
                temp.add(nums[i]);//结果集加上当前的数
                list.add(temp);
            }
        }
        return list;
    }

    //方法二   回溯法
    /**
     public static List<List<Integer>> res=new ArrayList<>();
     public static void main(String[] args) {
     int[] nums = {1, 2, 3};
     List<List<Integer>> list = subsets(nums);
     System.out.println(list);

     }

     public static List<List<Integer>> subsets(int[] nums) {
     List<Integer> temp=new ArrayList<>();
     dfs(nums,temp,0);//数组，临时集合，开始下标
     res.add(new ArrayList<>());//最后加一个空集合
     return res;
     }

     public static void dfs(int []nums,List<Integer> temp,int len){
     for(int i=len;i<nums.length;i++){
     temp.add(nums[i]);
     //System.out.println(temp);
     res.add(new ArrayList<>(temp));
     dfs(nums,temp,i+1);
     temp.remove(temp.size()-1);
     }
     }

     */
}
