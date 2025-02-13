package com.capgeminitraining.day2.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
        public static void reverseQueue(Queue<Integer> queue) {
            if (queue.isEmpty()) {
                return;
            }
            // Remove front element
            int front = queue.remove();
            //recursively call
            reverseQueue(queue);
            // Add the removed element back to the queue
            queue.add(front);
        }
        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(10);
            queue.add(20);
            queue.add(30);
            System.out.println("Original Queue: " + queue);
            reverseQueue(queue);
            System.out.println("Reversed Queue: " + queue);
        }
}



