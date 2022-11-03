package com.stacksandqueues;

import java.util.Iterator;
import java.util.LinkedList;

public class Stacks {

    //Declaring Linked List
    private static LinkedList list = new LinkedList();

    //Creating stacks method
    public void push(Object data) {
        list.addFirst(data);
    }

    public Object peak() {
        return list.getFirst();
    }

    public Object pop() {
        return list.removeFirst();
    }

    //Printing the values of stack
    public void printStack() {
        System.out.println("Stacks values printed below");
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        } else {
            System.out.println("Stack is empty");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.peak();
        //Printing the total stack
        System.out.println("Printing the stack");
        stack.printStack();

        //Printing top element and remove it from stack unless it is empty
        while (!list.isEmpty()) {
            System.out.println("Top element present in Stack is : " + stack.peak());
            System.out.println("Removing top element from Stack : " + stack.pop());
            System.out.println("Printing the Stack");
            stack.printStack();
            System.out.println();
        }

    }
}

