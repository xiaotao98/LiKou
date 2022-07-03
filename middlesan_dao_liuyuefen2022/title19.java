package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 删除链表的倒数第 N 个结点
 *
 * 思路：x个节点，删除倒数第n个，就等价于删除第x-n+1个节点，当然，删除第一个节点的情况特殊，直接返回head.next即可
 */
public class title19 {
    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        ListNode node2 = head;
        int num = 0, x = 1;
        while (node != null) {
            num++;
            node = node.next;
        }
        while (node2 != null && x < num - n) {//当x=num-n时，到达要删除节点的前一个节点
            x++;
            node2 = node2.next;
        }
        if (num - n == 0) {//说明要删除的是第一个节点
            return head.next;
        }
        node2.next = node2.next.next;
        return head;
    }*/

/*
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        for (int i = 0; i < n; i++) {//快指针先走n步
            fast = fast.next;
        }
        if (fast == null) {//，如果走完n步  fast为null  说明要删除的是第一个节点
            return head.next;
        }
        while (fast.next != null) {//fast.next为null  说明到了要删除的前一个节点
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    */

}
