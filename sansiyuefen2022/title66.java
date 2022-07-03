package com.LiKou.simple.sansiyuefen2022;

public class title66 {
    public static void main(String[] args) {
        //method1();
        int[] digits={7,8,9,9};
        boolean flag=false;
        for (int i = digits.length-1; i >=0; i--) {
            if (digits[i]!=9){//1 最后一位不是9  直接+1输出
                digits[i]++;
                flag=true;
                break;
            }
            digits[i]=0;
        }
        //跳出for循环，说明数字全部是9   全为9  就输出开头为1的数组
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;

        if (flag==true){
            for (int digit : digits) {
                System.out.print(digit+" ");
            }
        }else {
            for (int i : temp) {
                System.out.print(i+" ");
            }
        }


    }

    private static void method1() {
        int[] digits={9,9};
        int[] newarr=new int[digits.length+1];
        int[] newarr2=new int[digits.length+1];
        boolean flag=false;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i]!=9){
                flag=true;
            }
        }

        for (int i1 = 0; i1 < digits.length; i1++) {
            newarr[i1+1]=digits[i1];
        }

        for (int i = 0; i < digits.length; i++) {
            if (i==digits.length-1){
               digits[digits.length-1]= digits[i]+1;
               if (digits[digits.length-1]<10){
                   break;
               }else if (digits[digits.length-1]==10&&flag==true){
                   String s = String.valueOf(digits[digits.length - 1]);
                   int x1 = Integer.parseInt(s.substring(0, 1));
                   int x2 = Integer.parseInt(s.substring(1));
                   newarr[newarr.length-1]=x2;
                   newarr[0]=x1;
                    break;
               }else {
                   newarr2[0]=1;
                   break;
               }
            }
        }

        if (digits[digits.length-1]<10){
            for (int digit : digits) {
                System.out.print(digit+" ");
            }
        }else if (digits[digits.length-1]>=10&&flag==true){
            for (int i = 0; i < newarr.length; i++) {
                System.out.print(newarr[i]+" ");
            }
        }else if (digits[digits.length-1]>=10&&flag==false){
            for (int i : newarr2) {
                System.out.print(i+" ");
            }
        }
    }
}
