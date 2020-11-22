package com.mshetty.linkedlist;

import java.util.*;

public class MergeKLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode node = new ListNode(3);
        l1.val=1;
        l1.next = node;


        ListNode l2 = new ListNode();
        l2.val=1;
        node = new ListNode(4);
        l2.next = node;
        ListNode[] listNodes = {l1, l2};

        ListNode result = mergeKLists(listNodes);
        System.out.println("Result: ");
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }


    }

    //Method 1 : Brute Force

//    public static ListNode mergeKLists(ListNode[] lists) {
//        List<Integer> arraylist = new ArrayList<>();
//
//        for(int i=0; i<lists.length; i++){
//            ListNode head = lists[i];
//            while( head != null){
//                arraylist.add(head.val);
//                head = head.next;
//            }
//        }
//
//        Collections.sort(arraylist);
//        ListNode head = new ListNode();
//        ListNode result = head;
//        for(int i : arraylist){
//            ListNode resultNode = new ListNode(i);
//            head.next = resultNode;
//            head = head.next;
//        }
//        return result.next;
//    }

    //Method 2 : Priority Queue
//    public static ListNode mergeKLists(ListNode[] lists) {
//        Comparator<ListNode> cmp;
//        cmp = new Comparator<ListNode>() {
//            @Override
//            public int compare(ListNode o1, ListNode o2) {
//                // TODO Auto-generated method stub
//                return o1.val-o2.val;
//            }
//        };
//
//        Queue<ListNode> q = new PriorityQueue<ListNode>(cmp);
//        for(ListNode l : lists){
//            System.out.println(l.val);
//            if(l!=null){
//                q.add(l);
//            }
//        }
//        ListNode head = new ListNode(0);
//        ListNode point = head;
//        while(!q.isEmpty()){
//            point.next = q.poll();
//            point = point.next;
//            ListNode next = point.next;
//            if(next!=null){
//                q.add(next);
//            }
//        }
//        return head.next;
//    }

    public static ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> comp = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        };

     Queue<ListNode> pQueue = new PriorityQueue<>(comp);

        for(ListNode l : lists){
            ListNode head = l;
            while(head != null){
                pQueue.add(head);
                head = head.next;
            }
        }

        System.out.println("***********************");
        ListNode[] listNodes = (ListNode[]) pQueue.toArray();
        System.out.println("***********************");

        ListNode head = new ListNode();
        ListNode result = head;
        while(!pQueue.isEmpty()){
            head.next = pQueue.poll();
            head = head.next;
        }

        return result.next;

    }
}
