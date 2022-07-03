package com.LiKou.simple.liuyuefen2022;

/**
 * IP 地址无效化
 *
 * 思路1：直接用replace
 *
 * 思路2：用sb
 */
public class title1108 {
    public  String defangIPaddr1(String address) {
        String replace = address.replace(".", "[.]");
        return replace;
    }

    public  String defangIPaddr2(String address) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i)!='.'){
                sb.append(address.charAt(i));
            }else {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }

}
