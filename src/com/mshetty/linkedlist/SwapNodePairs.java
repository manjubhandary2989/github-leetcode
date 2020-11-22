package com.mshetty.linkedlist;


public class SwapNodePairs {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode head1 = l1;

        int i=2;
        while(i<11){
            ListNode node = new ListNode(i);
            l1.next = node;
            l1 = l1.next;
            i++;
        }

        ListNode result = swapPairs(head1);

        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode tempNext = head.next.next;
        ListNode tempFirst = head.next;
        ListNode tempSecond = head;

        head = tempFirst;
        head.next = tempSecond;
        head.next.next = swapPairs(tempNext);
        
        return head;


//        ListNode tempNext = head.next.next;
//        ListNode tempFirst = head.next;
//        ListNode tempSecond = head;
//
//        head = tempFirst;
//        head.next = tempSecond;
//        head.next.next = swapPairs(tempNext);
//
//        return head;
    }
}
