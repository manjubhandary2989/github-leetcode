package com.mshetty.linkedlist;


public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode head1 = l1;

        int i=2;
        while(i<6){
            ListNode node = new ListNode(i);
            l1.next = node;
            l1 = l1.next;
            i++;
        }

        ListNode result = reverseList(head1);

        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }


    }

    public static ListNode reverseList(ListNode head){

        ListNode point = head;
        int count = 0;
        while(point != null){
            count++;
            point = point.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        for(int i=0; i< (count-1); i++){
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return prev.next;
    }
}
