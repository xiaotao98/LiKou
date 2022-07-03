package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

public class title77 {
    public static void main(String[] args) {
        List<List<Integer>> list = combine(20, 16);
        System.out.println(list);

    }

    /**
     *自己写的方法超时了
     */
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            int len = list.size();
            for (int j = 0; j < len; j++) {
                List<Integer> list2 = new ArrayList<>(list.get(j));
                list2.add(i + 1);
                list.add(list2);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size() != k) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
