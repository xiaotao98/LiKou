package com.LiKou.simple.sansiyuefen2022;

public class title28 {
    public static void main(String[] args) {
        String haystack="";
        String needle="";
        int flag=-1;

        for (int i=0;i<haystack.length()-needle.length()+1;i++){
          if (haystack.substring(i,i+needle.length()).equals(needle)){
              flag=i;
              break;
          }
        }
        System.out.println(flag);



    }
}
