package com.mshetty.linkedlist;


public class RemoveNthNodeFromList {
    public static void main(String[] args) {

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        //sanity check
        if(head == null)
            return null;

        int counter = 1;
        ListNode dummyHead = head;
        while(head.next != null){
            ++counter;
            head = head.next;
        }
        System.out.println("Counter: " +counter);

        //sanity check
        if(counter == 1 && n<2) {
            return null;
        }


        head=dummyHead;
        int removalPos = (counter - n);
        if(removalPos == 0) {
            head = head.next;
            return head;
        }

        while(removalPos > 0){
            removalPos--;
            head = head.next;
        }


        if(head.next.next != null)
            head.next = head.next.next;
        else
            head.next = null;

        return dummyHead;
    }

}
