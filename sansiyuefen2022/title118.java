package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 *
 * 思路：把它看成是一行一行的集合组成的   然后通过循环，把每个集合存到一个大的集合。
 */
public class title118 {
    public static void main(String[] args) {
    }

    public static List<List<Integer>> shengchang(int numRows) {
        List<List<Integer>> listResult = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list2.add(1);
        list2.add(1);

        if (numRows == 1) {//1行
            listResult.add(list1);
            return listResult;
        }
        listResult.add(list1);
        if (numRows == 2) {//2行
            listResult.add(list2);
            return listResult;
        }
        listResult.add(list2);
        List<Integer> oldlist = list2;


        for (int i = 3; i <=numRows; i++) {//大于等于3行
            List<Integer> newlist = new ArrayList<>();
            newlist.add(1);//第一位为1
            for (int j = 1; j < i; j++) {
                if (j < i - 1) {
                    newlist.add(oldlist.get(j - 1) + oldlist.get(j));
                } else {
                    newlist.add(1);//最后一位为1
                }
            }
            listResult.add(newlist);
            oldlist = newlist;

        }
        return listResult;
    }


}
