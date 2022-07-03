package com.LiKou.simple.sansiyuefen2022;

import java.util.Stack;

/**
 * 有效的括号
 *
 * 思路1：遍历字符串  然后用replace替代
 *
 * 思路2：就是利用栈  左括号进栈  遇到右括号出栈   并且判断栈顶值  是否对应  最后判断栈是否为空
 */
public class title20 {

    public static void main(String args[]){

        String s="(){()}{}";
        boolean bool = isValid(s);
        System.out.println(bool);

    }

    /**
     * 思路1
     */
    private static void method2(String s) {
        int length = s.length()/2 ;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }

        if (s.length() == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    /**
     * 思路2
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (pop != '(') {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (pop != '[') {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (pop != '{') {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     *  之前写的辣鸡代码
     */
    public static boolean isValid3(String s) {
        //String s="(){}[]";
        Stack<String> stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            if(String.valueOf(s.charAt(i)).equals("(")){
                stack.push(String.valueOf(s.charAt(i)));
            }else if(String.valueOf(s.charAt(i)).equals(")")){
                if (stack.isEmpty()){
                    return false;
                }
                String ding=stack.pop();
                if(!ding.equals("(")){
                    return false;
                }
            }else if(String.valueOf(s.charAt(i)).equals("{")){
                stack.push(String.valueOf(s.charAt(i)));
            }else if(String.valueOf(s.charAt(i)).equals("}")){
                if (stack.isEmpty()){
                    return false;
                }
                String ding=stack.pop();
                if(!ding.equals("{")){
                    return false;
                }
            }else if(String.valueOf(s.charAt(i)).equals("[")){
                stack.push(String.valueOf(s.charAt(i)));
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                String ding=stack.pop();
                if(!ding.equals("[")){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    /**
     *  之前写的辣鸡代码
     */
    private static void method1() {
        String s=")";
        int leng=0;
        Stack<String> stack=new Stack<>();
        char[] schars = s.toCharArray();
        boolean flag=false;


        for (int i = 0; i < schars.length; i++) {
            if (String.valueOf(schars[i]).equals("(")||String.valueOf(schars[i]).equals("{")||String.valueOf(schars[i]).equals("[")){
                stack.push(String.valueOf(schars[i]));

            }else if (String.valueOf(schars[i]).equals(")")&&!stack.empty()){
                String peek = stack.peek();//取栈顶值  但是不出栈
               if (peek.equals("(")){
                   stack.pop();leng++;
               }else {
                   break;
               }
            }else if (String.valueOf(schars[i]).equals("}")&&!stack.empty()){
                String peek = stack.peek();
                if (peek.equals("{")){
                    stack.pop();leng++;
                }else {
                    break;
                }
            }else if (String.valueOf(schars[i]).equals("]")&&!stack.empty()){
                String peek = stack.peek();
                if (peek.equals("[")){
                    stack.pop();leng++;
                }else {
                    break;
                }
            }
        }
        if (stack.empty()&&leng==s.length()/2&&s.length()%2==0){
            flag=true;
        }
        System.out.println(flag);
    }
}
