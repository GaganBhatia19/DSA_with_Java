package com.company.StackDS.Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.lang.StringBuilder;

public class StackPr3_InfixToPostfix {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String infixExpression = br.readLine();// a+b*c-d/e
        String postfixExpression = convertInfixToPostfix(infixExpression);
        System.out.println("Infix expression: "+infixExpression+" and Postfix expression: "+postfixExpression);
    }
    public static String convertInfixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder("");
        ArrayDeque<Character> stack = new ArrayDeque<>();
        int i=0;
        while(i<infixExpression.length()) {
            // 1. check whether current character is operand or not
            // if operand then append it to postfix and increment i
            if(isOperand(infixExpression.charAt(i))) {
                postfix.append(infixExpression.charAt(i++));
            } else {
                // 2. otherwise first check if stack is empty then push operator into stack and increment i
                if(stack.isEmpty()) {
                    stack.push(infixExpression.charAt(i++));
                } else {
                    // 3. if stack is not empty then check/compare precedence of current ith element with the topmost element in the stack
                    if(precedence(infixExpression.charAt(i))>precedence(stack.peek())) {
                        // 4. if the precedence of current ith element is greater then push into stack and increment i
                        stack.push(infixExpression.charAt(i++));
                    } else {
                        // 5. Otherwise pop the topmost element from the stack and append it to postfix string (this will be repetitive as i will not increment)
                        postfix.append(stack.pop());
                    }
                }
            }
        }
        // 6. while the stack is not empty pop element from stack and append it to postfix
        while(!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }
    public static boolean isOperand(char c) {
        if(c=='*'||c=='+'||c=='-'||c=='/') return false;
        else return true;
    }
    public static int precedence(char c) {
        if(c=='+'||c=='-') return 1;
        else if(c=='*'||c=='/') return 2;
        return 0;
    }
}
