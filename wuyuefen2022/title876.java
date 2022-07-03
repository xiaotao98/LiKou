package com.LiKou.simple.wuyuefen2022;

/**
 * 链表的中间结点
 * <p>
 * 思路1：找到链表的节点个数n  然后找到n/2+1的位置即可
 * <p>
 * 思路2：快慢指针，快指针走两步，慢指针走一步，当快指针走到最后的时候，慢指针刚好走到中间
 */
public class title876 {
    /*public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        int mid = count / 2 + 1;
        int x = 0;
        while (head != null) {
            x++;
            if (x == mid) {
                return head;
            } else {
                head = head.next;
            }
        }
        return head;
    }*/
}
