package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 给你一个整数 n ，请你找出并返回第 n 个 丑数 。
 丑数 就是只包含质因数 2、3 或 5 的正整数。
 * <p>
 * 思路：动态规划法：三个指针分别*2，*3，*5
 * 每次取其中最小的一个存入到数组中，那个存进去了，对应的指针就加1.
 * 注意：从0开始，那么最后返回的就是nem[n-1]
 */
public class title264 {
    public static void main(String[] args) {
        int i = nthUglyNumber(10);
        System.out.println(i);
    }

    public static int nthUglyNumber(int n) {
        int num[]=new int[n];
        num[0]=1;
        int p2=0,p3=0,p5=0;
        for (int i = 1; i < n; i++) {
            int num2=num[p2]*2, num3=num[p3]*3, num5=num[p5]*5;
            num[i]=Math.min(Math.min(num2,num3),num5);
            if (num[i]==num2){
                p2++;
            }
            if (num[i]==num3){
                p3++;
            }
            if (num[i]==num5){
                p5++;
            }
        }
        return num[n-1];
    }

    /**
     * 自己想的这个方法  超时了
     * @param n
     * @return
     */
    public static int nthUglyNumber2(int n) {
        List<Integer>list=new ArrayList<>();
        for (int i=1;i<=Math.pow(2,31);i++){
            int x=i;
            while (x%5==0){
                x=x/5;
            }
            while (x%3==0){
                x=x/3;
            }
            while (x%2==0){
                x=x/2;
            }
            if (x==1){
                list.add(i);
            }
            if (list.size()==n){
                break;
            }
        }
        return list.get(n-1);
    }
}
