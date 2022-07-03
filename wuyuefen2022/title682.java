package com.LiKou.simple.wuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 棒球比赛
 *
 * 利用list  去进行每一个的操作
 */
public class title682 {
    public static void main(String[] args) {
        String[] ops= {"1"};
        int result = calPoints(ops);
        System.out.println(result);
    }

    public static int calPoints(String[] ops) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("+")) {
                list.add(list.get(list.size()-1)+list.get(list.size()-2));//list中最后两项相加，然后存入到list中
            }else if (ops[i].equals("C")) {
                list.remove(list.size()-1);//移除最后一项
            }else if (ops[i].equals("D")){
                list.add(2*list.get(list.size()-1));
            }else {
                list.add(Integer.valueOf(ops[i]));
            }
        }
        int sum=0;
        for (int i = 0; i <list.size(); i++) {
            sum=sum+list.get(i);
        }
        return sum;
    }
}
