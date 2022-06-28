package com.implementation.stack;

/**
 * Implementation of Stack class using Singly LinkedList, which provides most
 * commonly used functionalities such as push, pop, isEmpty, and peek.
 * 
 * Stack works in FILO (First In Last Out) manner.
 * 
 * @author Prakhar Shrivastava
 */
public class Stack<E> implements StackInterface<E> {
    // A singly linkedlist node
    private class Node {

        E data; // actual data
        Node next; // reference to the next node
    }

    Node top;

    /*
     * Custom Stack Constructor which intializes stack's top with null.
     */
    public Stack() {
        this.top = null;
    }

    /*
     * push method takes an element as argument and appends new node at the start
     * of the stack.
     */
    public void push(E ele) {
        // new node
        Node newNode = new Node();

        // initialize the new node fields
        newNode.data = ele;
        newNode.next = top;

        // updating top of the stack
        top = newNode;
    }

    /*
     * pop method returs the top node if Stack is not empty.
     */
    public void pop() {
        // check for stack underflow
        if (top == null) {
            System.out.print(StackConstants.STACK_UNDERFLOW);
            return;
        }

        // update the top pointer
        top = top.next;
    }

    /*
     * returns the top value from stack
     */
    public E peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println(StackConstants.STACK_UNDERFLOW);
            return null;
        }
    }

    // utility method for checking whether Stack is empty or not.
    public boolean isEmpty() {
        return top == null;
    }

    // Utility method to print the Stack
    public void printStack() {
        for (Node curr = top; curr != null; curr = curr.next) {
            System.out.println(curr.data);
        }
    }

}