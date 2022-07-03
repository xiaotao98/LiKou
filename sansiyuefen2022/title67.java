package com.LiKou.simple.sansiyuefen2022;

public class title67 {
    public static void main(String []args){
       // method1();
        //method2();
        String a="11";
        String b="1";

        int lena=a.length()-1;
        int lenb=b.length()-1;
        int jinwei=0;
        StringBuilder sb=new StringBuilder();

        //公共部分
        while (lena>=0&&lenb>=0){
            int sum=jinwei;
            sum=sum+a.charAt(lena)-'0';
            sum=sum+b.charAt(lenb)-'0';
            jinwei=sum/2;
            sb.append(sum%2);
            lena--;
            lenb--;
        }

        while (lena>=0){
            int sum=jinwei;
            sum=sum+a.charAt(lena)-'0';
            jinwei=sum/2;
            sb.append(sum%2);
            lena--;
        }
        while (lenb>=0){
            int sum=jinwei;
            sum=sum+b.charAt(lenb)-'0';
            jinwei=sum/2;
            sb.append(sum%2);
            lenb--;
        }

        if (jinwei==1){
            sb.append(1);
        }

        System.out.println(sb.reverse().toString());

    }

    private static void method2() {
        String a="11";
        String b="1";

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder builder = new StringBuilder();
        //循环相加两个字符串相同长度的低位数部分
        while (i >= 0 && j >= 0) {
            int sum = carry;
            sum += a.charAt(i) - '0';  //i--先使用i的值  - '0'就是字符转整数
            sum += b.charAt(j) - '0';
            carry = sum / 2;   //进位用的
            builder.append(sum % 2);
            i--;
            j--;
        }
        // 如果 a 还没遍历完成（a串比b串长），则继续遍历添加 a 的剩余部分
        while (i >= 0) {
            int sum = carry + a.charAt(i) - '0';
            carry = sum / 2;
            builder.append(sum % 2);
            i--;
        }
        // 如果 b 还没遍历完成（b串比a串长），则继续遍历添加 b 的剩余部分
        while (j >= 0) {
            int sum = carry + b.charAt(j) - '0';
            carry = sum / 2;
            builder.append(sum % 2);
            j--;
        }
        //如果 carry 不等于0 还有个进位数没加进去，需要补充
        if (carry == 1) {
            builder.append(carry);
        }
        //反转字符串获得正常结果

        System.out.println(builder.reverse().toString());
    }

    private static void method1() {
        String a="1010";
        String b="1011";
        int a1 = Integer.parseInt(a, 2);   //二进制转十进制
        int b1 = Integer.parseInt(b, 2);
        int sum = a1 + b1;
        String s = Integer.toBinaryString(sum);  //十进制转二进制
        System.out.println(s);
    }


}
