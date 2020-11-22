package com.mshetty.linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();


        // Use add() method to add elements into the Queue
        queue.add(4);
        queue.add(20000);
        queue.add(30);
        queue.add(10000);
        queue.add(5);
        queue.add(10);
        queue.add(15);
        Comparator comp = queue.comparator();
        System.out.println("Since the Comparator value is: " + comp);

        for (int element : queue)
            System.out.println(element + " ");


        PriorityQueue<String> pQueue = new PriorityQueue<String>();

        // Adding items to the pQueue using add()
        pQueue.add("C");
        pQueue.add("P");
        pQueue.add("A");
        pQueue.add("Bye");



        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + queue);
        System.out.println("PriorityQueue String: " + pQueue);
    }


}
