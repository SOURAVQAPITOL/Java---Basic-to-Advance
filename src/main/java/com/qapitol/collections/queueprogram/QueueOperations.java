package com.qapitol.collections.queueprogram;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        queue.offer(2);
        queue.offer(1);
        queue.offer(5);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);


        queue.addAll(arrayDeque);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        arrayDeque.offerFirst(1);
        arrayDeque.offerLast(2);
        System.out.println(arrayDeque);
    }
}
