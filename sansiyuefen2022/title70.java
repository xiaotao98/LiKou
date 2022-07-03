package com.LiKou.simple.sansiyuefen2022;

public class title70 {
    public static void main(String args[]) {
       // method1();//递归

        int n =5;

        int sum=0;

        int result1=1;
        int result2=2;
        for (int i=3;i<=n;i++){
            sum=result1+result2;
            result1=result2;
            result2=sum;
        }

        if (n==1){
            System.out.println(1);
        }else if (n==2){
            System.out.println(2);
        }else {
            System.out.println(sum);
        }



    }

    private static void method1() {
        int n = 45;
        int result = digui(n);
        System.out.println(result);
    }

    public static int digui(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return digui(n - 1) + digui(n - 2);
    }
}
