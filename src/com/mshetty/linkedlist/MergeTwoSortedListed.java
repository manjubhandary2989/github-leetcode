package com.mshetty.linkedlist;

import com.mshetty.linkedlist.ListNode;

public class MergeTwoSortedListed {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode node = new ListNode(3);
        l1.val=1;
        l1.next = node;


        ListNode l2 = new ListNode();
        l2.val=1;
//        node = new ListNode(4);
//        l2.next = node;

        ListNode result = mergeTwoLists(l1, l2);
        System.out.println("result :");
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //sanity check
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;


        ListNode resultNode = new ListNode();
        ListNode headNode = resultNode;

        ListNode head1 = l1;
        ListNode head2 = l2;
        System.out.println(head1.val);

       while(head1 != null || head2 !=null){
           System.out.println(head1.val < head2.val);
           if(head1.val < head2.val){
               ListNode curNode = new ListNode(head1.val);
               resultNode.next = curNode;
               resultNode = resultNode.next;
               head1 = head1.next;
           } else {
               ListNode curNode = new ListNode(head2.val);
               resultNode.next = curNode;
               resultNode = resultNode.next;
               head2 = head2.next;
           }

           if(head1 == null || head2 == null){
               ListNode node = head1 != null ? head1:head2;
               resultNode.next = node;
               break;
           }

       }
       return headNode.next;


    }

//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
//        if(l1 == null) return l2;
//        if(l2 == null) return l1;
//        if(l1.val < l2.val){
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//
//        } else{
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }

}
