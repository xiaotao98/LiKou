package com.LiKou.simple.liuyuefen2022;

/**
 * 长按键入
 */
public class title925 {
    public static void main(String[] args) {
        String name = "pyplrz";
        String typed = "ppyypllr";
        boolean bool = isLongPressedName(name, typed);
        System.out.println(bool);
    }

    public static boolean isLongPressedName(String name, String typed) {
        boolean flag = false;//标记name是否比较完
        char[] char_name = name.toCharArray();
        char[] char_typed = typed.toCharArray();
        int k = 0;//name中的指针
        for (int i = 0; i < char_typed.length; i++) {
            if (char_typed[i] == char_name[k]) {//输入和name对应字符相同
                k++;
                if (k == name.length()) {//说明目前name和typed比较完了，后续只要继续比较typed中的字符是否和name末尾字符相同
                    k--;
                    flag = true;
                }
            } else {//输入和name对应字符不相同  判断是否是长按
                if (k == 0) {//说明是首字母直接
                    return false;
                }
                if (flag) {//说明已经比完，只要比较输入是否是name中最后一个字符的长按
                    if (char_typed[i] != char_name[k]) {
                        return false;
                    }
                } else {//需要比较是否是上一次的长按
                    if (char_typed[i] != char_name[k - 1]) {
                        return false;
                    }
                }
            }
        }
        if (!flag) {//说明name没有比较完
            return false;
        }
        return true;
    }
}
