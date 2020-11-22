package com.mshetty.linkedlist;

public class ReverseKNodes {
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

        ListNode result = reverseKGroup(head1, 4);

        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode cur = head;
        dummy.next = head;

        System.out.println(prev);
        System.out.println(dummy);

        int len=0;
        ListNode point = head;
        while(point != null){
            len++;
            point = point.next;
        }
     //   System.out.println("point:" + point.val);
     //   System.out.println("head: " +head.val);

        int loopCount = len/k;
        for(int i=0; i<loopCount; i++){
            for(int j=0; j<k-1; j++){

                ListNode next = cur.next;
                cur.next = next.next;
                next.next = prev.next;
                prev.next = next;
                System.out.println("prev: "+prev.next.val);
                System.out.println("dummy: "+dummy.next.val);

            }

            prev = cur;
            cur = cur.next;
            System.out.println("cur: " +cur.val);
            System.out.println("prev: " +prev.val);
        }
        return dummy.next;
    }
}
