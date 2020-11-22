package com.mshetty.linkedlist;

import java.util.List;

public class LC2_AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        ListNode result = resultNode;
        int carry = 0;

        while(l1 != null || l2 != null ){
            int l1Val = (l1 == null) ? 0: l1.val;
            int l2Val = (l2 == null) ? 0 : l2.val;

            int sum = l1Val + l2Val + carry;
            System.out.println("sum: "+sum);

            int res = sum%10;
            System.out.println("res: " +res);

            carry = (sum)/10;
            System.out.println("carry : " +carry);

            resultNode.next = new ListNode(res);
            resultNode = resultNode.next;

            if(l1 != null)
                l1 = l1.next;

            if(l2 != null)
                l2 = l2.next;
        }
        if(carry > 0)
            resultNode.next = new ListNode(carry);

        return result.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(1))));

//        ListNode l1 = list1;
//        ListNode l2 = list2;
//
//        while(l1 != null){
//            System.out.println(l1.val);
//            l1 = l1.next;
//        }
//
//
//        while(l2 != null){
//            System.out.println(l2.val);
//            l2 = l2.next;
//        }

        ListNode  result = addTwoNumbers(list1, list2);

        System.out.println("**********************************");
        while(result != null){

            System.out.println(result.val);
            result = result.next;
        }


    }

}
