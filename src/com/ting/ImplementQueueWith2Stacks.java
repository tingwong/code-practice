package com.ting;

import java.util.Stack;

public class ImplementQueueWith2Stacks {

    private Stack<Integer> stack1 = new Stack();
    private Stack<Integer> stack2 = new Stack();


    public static void main(String[] args) {
        ImplementQueueWith2Stacks queue = new ImplementQueueWith2Stacks();

        queue.enqueue(15);
        queue.enqueue(13);
        queue.enqueue(0);
        queue.enqueue(2);
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.peek();

    }

    public void enqueue(int value) {

        stack1.push(value);
    }

    public Integer dequeue() {
         if (stack2.empty()) {
             while (!stack1.empty()) {
                 int value = stack1.pop();
                 stack2.push(value);
             }
         }

         return stack2.pop();

    }

    public Integer peek(){
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }

        if (!stack2.empty()) {
            return stack2.peek();
        } else {
            return null;
        }

    }

}
