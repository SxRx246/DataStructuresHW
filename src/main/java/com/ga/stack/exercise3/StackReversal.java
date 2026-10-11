package com.ga.stack.exercise3;

import java.util.Stack;

public class StackReversal {

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int item = stack.pop();

        reverseStack(stack);

        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            insertAtBottom(stack, item);
        }
    }

    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, item);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Original stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed stack: " + stack);

        System.out.println("==========================================");

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);

        System.out.println("Original stack: " + stack2);
        reverseStack(stack2);
        System.out.println("Reversed stack: " + stack2);

        System.out.println("==========================================");

        Stack<Integer> stack3 = new Stack<>();

        System.out.println("Original stack: " + stack3);
        reverseStack(stack3);
        System.out.println("Reversed stack: " + stack3);
    }
}
