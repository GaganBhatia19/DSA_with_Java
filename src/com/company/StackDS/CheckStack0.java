package com.company.StackDS;

public class CheckStack0 {
    public static void main(String[] args) {
        Stack1_ImpUsingArray stack = new Stack1_ImpUsingArray(5);
        stack.push(12);
        stack.push(34);
        stack.push(56);
        stack.push(78);
//        stack.push(78);
//        stack.push(78); // stack overflow

//        stack.display();

//        stack.pop();
//        stack.pop();

//        stack.display();

//        stack.pop();
//        stack.pop();
//        stack.pop();

//        stack.display();

        System.out.println(stack.peek(0));
        System.out.println(stack.peek(1));
        System.out.println(stack.peek(2));
        System.out.println(stack.peek(3));
        System.out.println(stack.peek(4));
    }
}
