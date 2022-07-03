package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.HashMap;
import java.util.Map;

/**
 * TinyURL 的加密与解密
 * <p>
 * 思路：把网址 https://leetcode.com/problems/design-tinyurl 加密，即返回一个简化的 http://tinyurl.com/4e9iAk   只有最后面 4e9iAk  是随机的
 * 将原来的整个字符串网址转成hashcode码，然后将其转为16进制字符串s，则加密结果返回为  http://tinyurl.com/+s  将（s，原网址）存入到map中，后面解密就用s去map中寻找
 */
public class title535 {

    Map<String, String> map = new HashMap<>();
    public String encode(String longUrl) {
        int hashCode = longUrl.hashCode();
//        String string = Integer.toHexString(hashCode);//转为16进制可以
        String string = String.valueOf(hashCode);//转为字符串即可
        map.put(string, longUrl);
        return "http://tinyurl.com/" + string;
    }

    public String decode(String shortUrl) {
        String substring = shortUrl.substring(19);
        return map.get(substring);
    }

}
