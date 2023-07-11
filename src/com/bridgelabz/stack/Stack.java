package com.bridgelabz.stack;


import com.bridgelabz.linkedlist.LinkedListFunctions;

public class Stack {
    LinkedListFunctions linkedList1=new LinkedListFunctions();
    public void push(int data) {
        linkedList1.addElementAtFirst(data);
    }
    public void pop() {
        linkedList1.firstElementDelete();
    }

    public void peek() {
        linkedList1.peek();
    }

    public void toPrint() {
        linkedList1.printList();
    }
}