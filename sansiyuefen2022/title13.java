package com.LiKou.simple.sansiyuefen2022;

import java.util.HashMap;

/**
 * 罗马数字转整数
 *
 * 思路：直接模拟，列举出特殊情况即可
 */
public class title13 {

    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i != s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    if (s.charAt(i + 1) == 'V') {
                        num = num + 4;
                    } else {
                        num = num + 9;
                    }
                    i++;
                } else {
                    num = num + 1;
                }
            } else if (s.charAt(i) == 'V') {
                num = num + 5;
            } else if (s.charAt(i) == 'X') {
                if (i != s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    if (s.charAt(i + 1) == 'L') {
                        num = num + 40;
                    } else {
                        num = num + 90;
                    }
                    i++;
                } else {
                    num = num + 10;
                }
            } else if (s.charAt(i) == 'L') {
                num = num + 50;
            } else if (s.charAt(i) == 'C') {
                if (i != s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    if (s.charAt(i + 1) == 'D') {
                        num = num + 400;
                    } else {
                        num = num + 900;
                    }
                    i++;
                } else {
                    num = num + 100;
                }
            } else if (s.charAt(i) == 'D') {
                num = num + 500;
            } else if (s.charAt(i) == 'M') {
                num = num + 1000;
            }
        }
        return num;
    }

    /**
     * 最开始写的方法   太菜了
     */
    private static void method1() {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);

        String s = "MCMXCIV";
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            //String.valueOf(chars[i])
            if (i<chars.length-1&& String.valueOf(chars[i]).equals("I") && String.valueOf(chars[i + 1]).equals("V")) {
                sum = sum + 4;
                i++;
            } else if (i<chars.length-1&&String.valueOf(chars[i]).equals("I") && String.valueOf(chars[i + 1]).equals("X")) {
                sum = sum + 9;
                i++;
            } else if (i<chars.length-1&&String.valueOf(chars[i]).equals("X") && String.valueOf(chars[i + 1]).equals("L")) {
                sum = sum + 40;
                i++;
            } else if (i<chars.length-1&&String.valueOf(chars[i]).equals("X") && String.valueOf(chars[i + 1]).equals("C")) {
                sum = sum + 90;
                i++;
            } else if (i<chars.length-1&&String.valueOf(chars[i]).equals("C") && String.valueOf(chars[i + 1]).equals("D")) {
                sum = sum + 400;
                i++;
            } else if (i<chars.length-1&&String.valueOf(chars[i]).equals("C") && String.valueOf(chars[i + 1]).equals("M")) {
                sum = sum + 900;
                i++;
            } else {
                Integer result = hm.get(String.valueOf(chars[i]));
                sum = sum + result;
            }


        }
        System.out.println(sum);
    }
}
