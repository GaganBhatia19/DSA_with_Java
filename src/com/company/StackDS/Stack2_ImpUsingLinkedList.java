package com.company.StackDS;

public class Stack2_ImpUsingLinkedList {
    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL(5);
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.isFull());

        stack.push(12);
        stack.push(52);
        stack.push(23);
        stack.push(62);
        stack.push(35);
        stack.push(35);

        stack.display();
        System.out.println("//////////////////////////////////");

        /*
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("//////////////////////////");
        stack.display();
         */
//        System.out.println(stack.peek(0));
//        System.out.println(stack.peek(1));
//        System.out.println(stack.peek(2));
//        System.out.println(stack.peek(3));
//        System.out.println(stack.peek(4));
//        System.out.println(stack.peek(5));

        System.out.println(stack.showTop());
    }
}

class StackUsingLL{
    // Size
    public int size;
    public NodeX topPtr; // top pointer
    public NodeX currentPtr; // holding reference of the First Node
    public int topIdx;
    StackUsingLL(int size) {
        this.size = size;
        topIdx = -1;
        currentPtr = null;
    }

    // full
    public boolean isFull() {
        return topIdx==size-1;
    }
    // empty
    public boolean isEmpty() {
        return topIdx==-1;
    }
    // push
    public void push(int element) {
        if(!isFull()) {
            topIdx++;
            topPtr = new NodeX(element,currentPtr);
            currentPtr = topPtr;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    //pop
    public int pop() {
        if(!isEmpty()) {
            topIdx--;
            int returnData = topPtr.data;
            topPtr = topPtr.next;
            return returnData;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    // peek
    public int peek(int index) {
        if(index>-1 && index<=topIdx) {
            int i=0;
            NodeX ptr = topPtr;
            while(i<index) {
                ptr = ptr.next;
                i++;
            }
            return ptr.data;
        } else {
            System.out.println("Invalid Access");
            return -1;
        }
    }

    public int showTop() {
        return topPtr.data;
    }

    //display
    public void display() {
        NodeX ptr = topPtr;
        while (ptr!=null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }
}

class NodeX{
    int data;
    NodeX next;
    NodeX(int data,NodeX next) {
        this.data = data;
        this.next = next;
    }
}