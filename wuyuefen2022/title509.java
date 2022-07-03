package com.LiKou.simple.wuyuefen2022;

public class title509 {
    public static void main(String[] args) {
        int fib = fib(3);
        System.out.println(fib);
    }

    /**
     * 动态规划
     * @param n
     * @return
     */
    public static int fib(int n) {
        int a=0,b=1,c=0;
        if (n<2){
            return n;
        }
        while (n>1){
            c=a+b;
            a=b;
            b=c;
            n--;
        }
        return c;
    }

    /**
     * 递归  效率低
     * @param n
     * @return
     */
    public static int fib2(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        return fib(n-1)+fib(n-2);
    }
}
