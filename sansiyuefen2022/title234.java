package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 回文链表:
 * 思路：（链表问题转为集合问题）把链表中的数值全部加入集合list中，然后一前一后比较是否相等
 * 注意  只要比较一半的数值即可。
 */
public class title234 {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        for (int i = 0; i < list.size()/2; i++) {
            if (list.get(i)!=list.get(list.size()-1-i)){
                return false;
            }
        }
        return true;
    }

    /**
     * 栈的思想
     * @param head
     * @return
     */
    public static boolean isPalindrome2(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode node=head;
        while (node!=null){
            stack.push(node.val);
            node=node.next;
        }
        while (head!=null){
            if (head.val!=stack.pop()){
                return false;
            }
            head=head.next;
        }
        return true;
    }
    //节点定义
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
