package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 删除链表中的节点:
 * 给了要删除的节点。既然自己不能删除，那么就删除别人。
 * 把下一个节点的值赋给要删除的这个节点，然后删除下一个节点，不就ok了。
 */
public class title237 {
    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
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
