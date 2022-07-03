package com.LiKou.simple.wuyuefen2022;

import java.util.ArrayList;
import java.util.List;

public class title599 {
    public static void main(String[] args) {
        String[] list1={"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2={"KFC", "Shogun", "Burger King"};
        String[] strings = findRestaurant(list1, list2);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {

        int index = list1.length + list2.length;//假设一个不存在的索引值

        //找最小的索引
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int sum = i + j;
                    if (sum < index) {
                        index = sum;//记录最小的索引
                    }
                    break;
                }
            }
        }
        //找具体的名字
        List<String> list = new ArrayList<>();//将共同喜爱的最小索引餐馆存到list中
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j]) && (i + j) == index) {
                    list.add(list1[i]);
                    break;
                }
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
