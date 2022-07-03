package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 * <p>
 * 思路1：把每一个字符以及对应下标存到map中，用start指针记录当前子串开始的下标
 * 遍历字符串，当前无重复元素  count++   否则  判断重复元素旧的下标是否小于start  如果小于  说明子串中该元素不重复  count++   否则   更新start以及count  最后更新map中重复元素的下标
 *
 * 思路2：双指针的思想
 *
 * 思路3：把每一个字符以及对应下标存到map中，用start指针记录当前子串开始的下标
 */
public class title3 {
    public static void main(String[] args) {
        String s = "tmmzuxt";
        int i = lengthOfLongestSubstring2(s);
        System.out.println(i);
    }




    /**
     *思路3:把每一个字符以及对应下标存到map中，用start指针记录当前子串开始的下标
     * 遍历字符串，当前无重复元素  存入map中   否则  判断重复元素旧的下标是否小于start  如果小于（为假重复）  说明子串中该元素不重复  计算长度  否则   更新start以及计算长度  最后更新map中重复元素的下标
     */
    public static int lengthOfLongestSubstring3(String s) {
        if (s.length()==0||s.length()==1){
            return s.length();
        }
        int max = 1;
        Map<Character,Integer> map=new HashMap<>();
        char[] chars = s.toCharArray();
        int start=0;
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])){//无重复
                map.put(chars[i],i);
                if (i== chars.length-1){
                    max=Math.max(max,i-start+1);//说明到末尾了，取最大值
                }
            }else {//遇到重复的了
                int old = map.get(chars[i]);//取出原来的坐标
                if (start>old){//说明是假重复
                    max=Math.max(max,i-start+1);//取最大值
                }else {//真重复
                    max=Math.max(max,i-start);//取最大值
                    start=old+1;//更新子串起点start
                }
                map.put(chars[i],i);//更新现在的坐标
            }
        }
        return max;
    }

    /**
     *思路1
     */
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();// 存字符以及对应的下标
        int max = 0;//最大值
        int count = 0;//当前子串长度
        int start = 0;// 记录当前子串开始的下标
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {// 说明目前没有重复元素
                count++;
                map.put(s.charAt(i), i);
                if (count > max) {
                    max = count;// 记录最大值
                }
            } else {// 发现重复元素
                Integer old = map.get(s.charAt(i));// 找到重复元素之前的坐标
                if (start > old) {// 说明当前重复元素不在子串中   不要管
                    count++;
                    if (count > max) {
                        max = count;// 记录最大值
                    }
                } else {// 说明当前重复元素在子串中
                    start = old + 1;// 更新子串的开始下标
                    count = i - old;// 更新count值，这里肯定比max小  所以不要更新max
                }
                map.put(s.charAt(i), i);// 更新下标
            }
        }
        return max;
    }

    /**
     * 思路二   利用双指针
     */
    public static int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> map = new HashMap<>();// 存字符以及对应的下标
        int max = 0;//最大值
        int left = 0, right = 0;
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        map.put(s.charAt(0), 0);
        for (int i = 1; i < s.length() && left < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {// 说明目前没有重复元素
                left++;
                map.put(s.charAt(i), i);
                if (left - right + 1 > max) {
                    max = left - right + 1;// 记录最大值
                }
            } else {// 发现重复元素
                left++;
                Integer old = map.get(s.charAt(i));// 找到重复元素之前的坐标
                if (old >= right) {
                    right = old + 1;
                }
                if (left - right + 1 > max) {
                    max = left - right + 1;// 记录最大值
                }
                map.put(s.charAt(i), i);// 更新下标
            }
        }
        return max;
    }
}
