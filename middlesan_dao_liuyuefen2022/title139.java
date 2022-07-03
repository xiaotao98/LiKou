package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.List;

/**
 * 单词拆分
 * <p>
 * 思路：动态规划   dp[i]判断 0-(i-1)能否被字典拼接  在0-(i-1)中设置一个j   那么如果dp[j]=true  则只需要判断 j-(i-1)即可
 */
public class title139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[] = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                }
            }
        }
        return dp[dp.length - 1];
    }

}
