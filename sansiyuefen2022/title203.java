package com.LiKou.simple.sansiyuefen2022;


/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。

 * 思路：新建一个节点(目的就是如果第一个值就是要删除的，也能删掉)，然后让这个节点指向头节点，再定义一个节点cur=新建的节点
 * 如果cur。next==val 那么就让cur.next.next赋值给cur.next
 * 否则 cur=cur.next
 */
public class title203 {

    /**
     *最容易理解的方法
     */
    public ListNode removeElements4(ListNode head, int val) {
        ListNode newNode = new ListNode();  //新建一个节点
        newNode.next = head;  //让这个节点的next指针指向头节点
        ListNode pre = newNode;  //定义一个前节点
        while(head!=null ){//遍历每一个节点
            if(head.val==val){
                pre.next=head.next;
                head=head.next;
            }else{
                pre=head;//前节点要一直跟着变化的
                head=head.next;
            }
        }
        return newNode.next;
    }

    //方法1：新增一个节点
    public static ListNode removeElements(ListNode head, int val) {
        ListNode newNode = new ListNode();
        newNode.next = head;
        ListNode cur = newNode;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return newNode.next;
    }

    //方法2：不新增节点
    public ListNode removeElements2(ListNode head, int val) {
        while (head != null && head.val == val){
            head = head.next;
        }
        ListNode prev = head;
        if (prev != null)
        {
            while (prev.next != null)
            {
                if (prev.next.val == val)
                    prev.next = prev.next.next;
                else
                    prev = prev.next;
            }
        }
        return head;
    }

    public static ListNode removeElements3(ListNode head, int val) {
        ListNode pre = new ListNode();
        ListNode cur = head;
        while (cur != null) {
            pre.next =cur;
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    //节点定义
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
