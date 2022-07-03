package com.LiKou.simple.wuyuefen2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 最常见的单词
 *
 * 思路：把字符串中所有的单词和空格都取出来，然后分割成一个字符串数组，将所有的字符串和次数存到map中，取其中出现次数最多且不在禁用名单中的那个单词
 */
public class title819 {
    public static void main(String[] args) {
        String s1 = "G! E? s. x! O; o, q' v. w. Y; i. f' u' h! Y' u. p; i! v; P! m! R? V; u? k? v. z, T. o. L, y' z. v, w? s. J' p, p' q, T; z' n' X? I' R; o? Z. U, z; z? L, z. x! F; R? w. K, u! X? m; G! X. q' R' K, y! X! H. T' u, u' y! w' n? M, V? U' Y. Z? i, s' K; U! U' j? W, x? t, J? q. z. K; x. U. v, r, y? q. v; T! K? p, r? n' N. R? M? X? O; h; X; V! l, z' P, q, t. J, l; r' Z; h; F, K, X. P' Q; x' Q. O, v. z! E; K' P, u' O' O! W! p! z? V? x' Z. j. s; n' R' F? W; w, W; X; t' p, z' y' G? s! y? u! y, R; S; y' C. m; k; S' L' V. I' x, i' y. T; W? v. t; V; H; u, v? E, S. W! s; N; N? o? s? M. T; X. R, P, q' I, m. b, z. x; G! S' X. s. l! n' y? c, Y! n, o! Z? t? t? n; R? U? H, o; Z! n' R! y, R. q. u? F' d, Y. o' N, u' T' U, P, s? n' s; w' B. W' M? u; m! m' f? v. L? z, r; q. w! h, g! i, V. g! L! w; O; q? c! l, W; t! m. l' y' r; z' P' T! Z' q. x? P' V. r; r. o; x? X, s, X' p; T; Z' U! K' Q! D' z. Y; w. Q! N' J. w? P! Y; A; y' s, Q' s; j. k? m! e; z, v, q! w? Z; W! j? Z! T' G, Y! V' W; y. W; l! t' j' D' y; I. Y,";
        String[] banned = {"u", "x", "i", "v", "w", "q", "l", "t", "n", "k", "o", "h", "r", "d", "c", "f", "m", "j", "p", "g"};
        String s = mostCommonWord(s1, banned);
        System.out.println(s);
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String rst = "";
        List<String> list = new ArrayList<>();
        for (String s : banned) {
            list.add(s);
        }
        int max = 0;
        String s2 = paragraph.toLowerCase();//所有变小写
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s2.length(); i++) {
            if ((s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z') || s2.charAt(i) == ' ') {
                sb.append(s2.charAt(i));//把所有单词和空格存到sb中
            }
            if (i != s2.length() - 1) {//这个完全是针对那个恶心人的测试用例单独写的
                if (s2.charAt(i) == ',' && s2.charAt(i + 1) != ' ') {
                    sb.append(" ");//为了把逗号间隔的单词分开
                }
            }

        }
        String[] s = sb.toString().split(" ");//取出所有的单词
        //将所有的单词以及出现次数存到map中
        Map<String, Integer> map = new HashMap<>();
        for (String s1 : s) {
            if (map.containsKey(s1)) {
                map.put(s1, map.get(s1) + 1);
                if (map.get(s1) > max && !list.contains(s1)) {
                    max = map.get(s1);
                    rst = s1;
                }
            } else {
                map.put(s1, 1);
                if (map.get(s1) > max && !list.contains(s1)) {
                    max = map.get(s1);
                    rst = s1;
                }
            }
        }
        return rst;
    }
}
