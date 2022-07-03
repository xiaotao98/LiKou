package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 两数相加
 * <p>
 * 思路：新建一个节点  然后定义一个进位指针   分三种情况   公共长度相加   链表1单独加   链表2单独加
 * 每次把相加对10取余的结果   赋值给一个新的节点   然后让新链表节点指向新节点  每操作完一次  让所有不为空的链表指针下移一个节点
 */
public class title2 {
    /*
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        int jinwei = 0;
        while (l1 != null && l2 != null) {
            ListNode newnode = new ListNode((l1.val + l2.val + jinwei) % 10);
            node.next = newnode;
            jinwei = (l1.val + l2.val + jinwei) / 10;
            l1 = l1.next;
            l2 = l2.next;
            node = node.next;
        }
        while (l1 != null) {
            ListNode newnode = new ListNode((l1.val + jinwei) % 10);
            node.next = newnode;
            jinwei = (l1.val + jinwei) / 10;
            l1 = l1.next;
            node = node.next;
        }
        while (l2 != null) {
            ListNode newnode = new ListNode((l2.val + jinwei) % 10);
            node.next = newnode;
            jinwei = (l2.val + jinwei) / 10;
            l2 = l2.next;
            node = node.next;
        }
        if (jinwei == 1) {//说明最后还要加一个1
            ListNode newnode = new ListNode(1);
            node.next = newnode;
        }
        return head.next;
    }*/


}


