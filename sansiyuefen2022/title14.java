package com.LiKou.simple.sansiyuefen2022;

import org.w3c.dom.css.CSSStyleRule;

public class title14 {
    public static void main(String[] args) {
        String strs[]={"flower","flow","flight"};
        String temp=strs[0];
        for (int i = 1; i < strs.length; i++) {
            temp= sel(temp,strs[i]);//两个两个的比
        }

        System.out.println(temp);

    }
    public static String sel(String s1,String s2){
        String x="";
        int i;
        for (i=0;i<Math.min(s1.length(),s2.length());i++){
            if (s1.charAt(i)==s2.charAt(i)){
               x=x+s1.charAt(i);
            }else {
                break;
            }
        }
        //return s1.substring(0,i);//法一  利用s1.charAt(i)！=s2.charAt(i)
        return x;
    }

}
