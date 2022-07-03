package com.LiKou.simple.sansiyuefen2022;

public class title83 {
    public static void main(String[] args) {

       // return method2();  //正确方法

    }

    private static ListNode method2() {
        ListNode head = new ListNode(0);

        //这里先要注意
        if (head == null) {
            return head;
        }
        ListNode cur = head;//定义一个节点=头节点

        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }

        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
