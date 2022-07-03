package com.LiKou.middle.middlesan_dao_liuyuefen2022;

public class title468 {
    public static void main(String[] args) {
        String queryIP = "f:f:f:f:f:f:f:f";
        String s = validIPAddress(queryIP);
//        String[] split = queryIP.split(":");
        System.out.println(s);


    }

    //先判断是ipv4还是v6 把ip按点分开
    public static String validIPAddress(String queryIP) {
        if (queryIP.length() < 6 || queryIP.length() > 39) return "Neither";//ipv4最小长度为6,ipv6最大长度39
        boolean flag = true;
        for (int i = 0; i < queryIP.length(); i++) {
            if (queryIP.charAt(i) == ':') {
                flag = false;
                break;
            }
        }
        if (flag) {//是ipv4
            if (queryIP.charAt(queryIP.length() - 1) == '.') return "Neither";//预防最后面为.
            String[] split = queryIP.split("\\.");
            if (split.length != 4) return "Neither";
            for (int i = 0; i < split.length; i++) {
                //先判断是否都是数字，数值范围，如果大于0，就在判断第一位，如果等于0，判断他的位数是否为1
                String s = split[i];
                if (s.length() == 0) return "Neither";
                for (int j = 0; j < s.length(); j++) {//先判断是否都是数字
                    if (!Character.isDigit(s.charAt(j))) {
                        return "Neither";
                    }
                }
                if (Integer.valueOf(s) >= 0 && Integer.valueOf(s) <= 255) {
                    if (Integer.valueOf(s) > 0) {//判断第一位
                        if (s.charAt(0) == '0') {
                            return "Neither";
                        }
                    } else {//判断他的位数是否为1
                        if (s.length() != 1) {
                            return "Neither";
                        }
                    }
                } else {
                    return "Neither";
                }
            }
        }
        if (!flag) {//Ipv6
            if (queryIP.charAt(queryIP.length() - 1) == ':') return "Neither";//预防最后面为:
            String[] split = queryIP.split(":");
            if (split.length != 8) return "Neither";
            for (int i = 0; i < split.length; i++) {
                //先判断是否都是数字，数值范围
                String s = split[i];
                if (s.length() == 0) return "Neither";
                if (s.length() > 4 || s.length() < 1) {//判断每一段长度
                    return "Neither";
                }
                for (int j = 0; j < s.length(); j++) {//先判断是否都是数字
                    if (!Character.isDigit(s.charAt(j))) {//如果不是数字，判断是否是a-f
                        if ((s.charAt(j) >= 'a' && s.charAt(j) <= 'f') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'F')) {
                            continue;
                        } else {
                            return "Neither";
                        }
                    }
                }
            }
        }
        //走到这里，一定是个合格的ip地址
        if (flag) {
            return "IPv4";
        }
        return "IPv6";
    }
}
