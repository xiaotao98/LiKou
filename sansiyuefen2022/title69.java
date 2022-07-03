package com.LiKou.simple.sansiyuefen2022;

public class title69 {
    public static void main(String[] args) {
        //method1();
        //method2();
           // method3();//符合所有要求   3容易想到
        //method4()//符合所有要求


    }


    private static int method4() {
        int x=1000;
        int left=1,right=x;
        while (left<=right){
            int mid = left+(right-left)/2;
            //注意整数溢出问题
            if (mid>x/mid){
                right=mid-1;
            }else if (mid<x/mid){
                left=mid+1;
            }else if (mid==x/mid){
                return mid;
            }
        }
        return right;
    }

    private static int method3() {
        int x=2147395600;

        if (x==1){
            return 1;
        }
        int left=0;
        int right=x;

        while (right-left>1){
            int mid=(right+left)/2;
            if (mid>x/mid){
                right=mid;
            }else {
                left=mid;
            }
        }
        return left;
    }

    private static void method2() {
        int x=2147395600;
        int result=0;
        boolean flag=true;
        if(x==1||x==2||x==3){
            result=1;
            flag=false;
        }
        if(flag){
            for (int i=1;i<=(x+1)/2;i++){
                if (i*i==x){
                    result=i;
                    break;
                }
                if ((i*i)>x){
                    result=i-1;
                    break;
                }
            }
        }

        System.out.println(result);
    }

    private static void method1() {
        int x=2147395600;
        int result=0;
        for (int i=1;i<=x/2;i++){
            if (i*i==x){
               result=i;
               break;
            }
            if ((i*i)>x){
                result=i-1;
                break;
            }
        }
        System.out.println(result);
    }
}
