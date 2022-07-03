package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Excel表列名称
 * <p>
 * 思路：//这个题有点意思，切勿眼高手低。
 * //1对应A，26对应Z，看起来像是27进位，似乎应该每次余27，每次除以27。
 * //但是，因为1对应A，而27对应的也是A，1%27=1, 27%27=0，同一个A余数不同，构成矛盾。
 * //那么除以26行不行？
 * //1%26=1,27%26=1，看起来这样似乎可以保持一致。
 * //但是当26%26的时候，为0，可是实际的值却为Z，又构成了新的矛盾。
 * // 所以，我们调整对应关系，让0对应A，25对应Z，26对应AA，这样就构成了一个正常的26进位。
 * //这样对于A：0%26=0， 对于AA：26%26=0，在余数这里可以保持一致。
 * //新的对应关系是原先对应关系-1得到，所以在每次操作的时候，都要让columnNumber-1，得到新的对应关系。
 */
public class title168 {
    public static void main(String[] args) {
        String s = convertToTitle1(52);
        System.out.println(s);
    }

    /**
     * 我的思路2：
     * 首先把传入的整数一直取余数添加到集合list中，在翻转
     * 然后遍历集合，将集合中的每个整数转为字符添加到字符串容器中，然后转为String
     * <p>
     * 思路1：直接用一个sb，不用list集合
     *
     * @param columnNumber
     * @return
     */

    public static String convertToTitle1(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        if (columnNumber > 0 && columnNumber < 27) {
            char a = (char) ((columnNumber - 1) % 26 + 'A');//(columnNumber - 1) % 26 + 'A' 将整数转为字符 1对应A 2对应B。。
            sb.append(a);
            return sb.toString();
        }
        while (columnNumber > 26) {
            //每次把余数添加到数组中去
            char a = (char) ((columnNumber - 1) % 26 + 'A');
            sb.append(a);
            columnNumber = (columnNumber - 1) / 26;
        }
        sb.append((char) ((columnNumber - 1) % 26 + 'A'));
        return sb.reverse().toString();
    }

    public static String convertToTitle2(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList();
        if (columnNumber > 0 && columnNumber < 27) {
            list.add(columnNumber - 1);
            for (Integer i : list) {
                char a = (char) ((i) % 26 + 'A');
                sb.append(a);
            }
            return sb.toString();
        }

        while (columnNumber > 26) {
            list.add(columnNumber - 1 % 26);//每次把余数添加到数组中去
            columnNumber = (columnNumber - 1) / 26;
        }
        list.add(columnNumber - 1);
        Collections.reverse(list);//最后记得翻转一下集合

        for (Integer i : list) {
            char a = (char) ((i) % 26 + 'A');
            sb.append(a);
        }
        return sb.toString();
    }
}
