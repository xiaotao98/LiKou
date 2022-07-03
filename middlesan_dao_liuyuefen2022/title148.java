package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 排序链表
 * <p>
 * 思路1： 归并排序（主要考察的就是这个）  利用快慢指针将链表一分为二（一直递归分），然后合并两个链表
 * <p>
 * 思路2：把链表中的数放到集合中，然后排序，最后修改原链表中的数值
 */
public class title148 {

/*
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //把链表分为两个
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre_slow = null;//关键，记录slow的前节点
        while (fast != null && fast.next != null) {
            pre_slow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode r = sortList(slow);//处理右半段链表
        pre_slow.next = null;//切断左右两半的联系
        ListNode l = sortList(head);//处理左半段链表
        return merge(l, r);
    }

    //合并两个有序链表
    public ListNode merge(ListNode l, ListNode r) {
        ListNode head = new ListNode(-1);
        ListNode node = head;
        while (l != null && r != null) {
            if (l.val < r.val) {
                node.next = l;
                l = l.next;
                node = node.next;
            } else {
                node.next = r;
                r = r.next;
                node = node.next;
            }
        }
        if (l == null) {
            node.next = r;
        }
        if (r == null) {
            node.next = l;
        }
        return head.next;
    }
    */


    /**
     * 思路2
     */
    /*
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode node=head;
        ListNode cur=head;
        List<Integer> list=new ArrayList<>();
        while(node!=null){
            list.add(node.val);
            node=node.next;
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            cur.val=list.get(i);
            cur=cur.next;
        }
        return head;
    }
    */

}
