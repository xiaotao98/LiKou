package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 环形链表 II
 * <p>
 * 思路1：首先利用双指针，判断是否有环。没有，返回null
 * 有环，然后找到环的起始下标（快慢指针相遇点到入环节点的距离 == 起点到入环节点的距离），然后返回
 * <p>
 * 思路2：首先遍历链表，给他标记，然后判断是否有环  没有，返回null，有环，然后找到环的起始下标，然后返回
 */
public class title142 {

    /**
     *思路1
     */
    /*
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        boolean bool = false;//标记是否有环
        while (fast != null && fast.next != null) {//快慢指针
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                bool = true;
                break;
            }
        }
        if (!bool) {//没有环
            return null;
        }
        ListNode node = head;
        while (node != slow) {
            node = node.next;
            slow = slow.next;
        }
        return node;
    }
    */


    /**
     *思路2
     */
    /*
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        int num = 100001;
        while (node != null && node.val < 100001) {
            node.val = num;
            num++;
            node = node.next;
        }
        if (node == null) {//说明没有环
            return null;
        }
        int index = node.val - 100001;//需要返回的下标
        int i = 0;
        while (i != index) {
            head = head.next;
            i++;
        }
        return head;
    }
    */

}
