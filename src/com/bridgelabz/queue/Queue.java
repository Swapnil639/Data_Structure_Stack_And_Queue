package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.LinkedListFunctions;

public class Queue {
    LinkedListFunctions linkedList=new LinkedListFunctions();
    public void enque(int data) {
        linkedList.addElementAtLast(data);
    }
    public void toPrint() {
        linkedList.printList();
    }
}
