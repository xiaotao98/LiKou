package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 字符串转换整数 (atoi)
 *
 * 思路：就是考虑各种情况
 * 1  前置空格   可以直接跳过  就是没有出现任何其他的东西
 * 2  遇到了数字或者符号之后    一旦遇到非数字  就终止
 * 3  第一次遇到符号，标记  继续循环   如果是第二次遇到符号  也是终止
 * 4   遇到数字后，又遇到数字   加到新字符串后面
 * 5   碰到字母的情况  直接终止
 */
public class title8 {

    public  int myAtoi(String s) {
        char[] chars = s.toCharArray();
        String new_s = "";
        boolean flag=false;//代表新字符串 有没有塞数字
        boolean fuhao=false;//代表  有无符号
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] == '+' || chars[i] == '-')&&!flag){
                if (fuhao){
                    break;
                }
                new_s = new_s + chars[i];
                fuhao=true;
            }else if ( Character.isDigit(chars[i])) {
                flag=true;
                new_s = new_s + chars[i];
            }else if ((flag||fuhao)&&!Character.isDigit(chars[i])){//这里是塞了数字或者符号  但是又碰到不是数字的情况
                break;
            }else if (chars[i]==' '&&!flag&&!fuhao){//前置空格
                continue;
            }else {//这里是碰到字母的情况
                break;
            }
        }
        if (!flag){//新字符串，没有加数字，直接返回0
            return 0;
        }
        //把字符串转为整数  用Double
        double aDouble = Double.parseDouble(new_s);
        if (aDouble >= (Math.pow(2, 31) - 1)) {
            return (int) (Math.pow(2, 31) - 1);
        } else if (aDouble <= Math.pow(-2, 31)) {
            return (int) Math.pow(-2, 31);
        }
        return (int) aDouble;
    }

}
