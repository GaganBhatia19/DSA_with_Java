package com.company.StackDS;

public class Stack1_ImpUsingArray {
    // Stack of type Int
    public int size;
    private int top;
    private int[]sarr;

    Stack1_ImpUsingArray(int size){
        this.size = size;
        this.sarr = new int[size];
        this.top = -1;
    }

    // check if it's empty
    public boolean isEmpty() {
        return top==-1;
    }
    //  check if it's full
    public boolean isFull() {
        return top==size-1;
    }

    // push
    public void push(int element) {
        if(!this.isFull()) {
            sarr[++top] = element;
        } else {
            System.out.println("Stack overflow");
        }
    }

    // pop
    public int pop() {
        if(!this.isEmpty()) {
            return sarr[top--];
        } else {
            System.out.println("Stack underflow");
            return -1;
        }
    }

    //peek
    public int peek(int index) {
        if(index<=top && index>-1)
            return sarr[top-index];
        else return -1;
    }

    // stack top
    public int stackTop(){
        return sarr[top];
    }

    //display
    public void display() {
        for(int i=top;i>=0;i--)
            System.out.println(sarr[i]);
    }
}
