package com.stacksandqueues;

import java.util.Iterator;
import java.util.LinkedList;

public class Stacks {
    //Declaring Linked List
    private LinkedList list = new LinkedList();

    //Creating stacks method
    public void push (Object data)
    {
        list.addFirst(data);
    }

    //Printing the top value
    public Object peek()
    {
        return list.getFirst();
    }

    //Printing the values of stack
    public void printStack()
    {
        System.out.println("Stacks values are printed below");
        if (!list.isEmpty())
        {
            Iterator it = list.iterator();
            while (it.hasNext())
            {
                System.out.print(it.next()+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.peek();
        //Printing the top element of stack
        System.out.println("Top element of stack is : "+stack.peek());
        stack.printStack();        //Printing the total stack

    }
}


