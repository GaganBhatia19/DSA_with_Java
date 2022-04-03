package com.company.StackDS.Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class StackPr4_InfixToPostfix2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String infixExpression = br.readLine();// (a+b)*c-d^e^f
        String postfixExpression = convertInfixToPostfix(infixExpression);
        System.out.println("Infix expression: "+infixExpression+" and Postfix expression: "+postfixExpression);
    }
    public static String convertInfixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder("");
        ArrayDeque<Character> stack = new ArrayDeque<>();
        int i=0;
        while(i<infixExpression.length()) {
            char currentChar = infixExpression.charAt(i);
            if(currentChar==')') {
                // 1. check if the character is ) if yes then check if stack is empty
                if(!stack.isEmpty()) {
                    // 2. if stack is not empty then simply just pop the chars from stack till it becomes empty
                    char popCh = stack.pop();
                    if(popCh!='('){
                        // 3. if '(' comes then don't append in postfix
                        postfix.append(popCh);
                    }
                } else i++; // 4. if stack is empty simply do i++;
            } else if(currentChar=='(') {
                // 5. if encounter '(' simply push into stack
                stack.push(currentChar);
                i++;
            } else if(isOperand(currentChar)) {
                postfix.append(currentChar);
                i++;
            } else {
                if(stack.isEmpty()) {
                    stack.push(currentChar);
                    i++;
                } else {
                    if(outStackPre(currentChar)>inStackPre(stack.peek())) {
                        // here check if the precedence of element outstack is greater then precedence of element instack of the top element
                        stack.push(currentChar); // then push that element into stack
                        i++;
                    } else {
                        // otherwise pop elements from stack and append to postfix
                        postfix.append(stack.pop());
                    }
                }
            }
        }
        while(!stack.isEmpty()) postfix.append(stack.pop());
        return postfix.toString();
    }
    public static boolean isOperand(char c) {
        if(c=='+'||c=='-'||c=='/'||c=='*'||c=='^'||c=='('||c==')') return false;
        else return true;
    }
    public static int outStackPre(char c) {
        if(c=='+'||c=='-') return 1;
        else if(c=='*'||c=='/') return 3;
        else if(c=='^') return 6;
        else if(c=='(') return 7;
        else if(c==')') return 0;
        else return -1;
    }
    public static int inStackPre(char c) {
        if(c=='+'||c=='-') return 2;
        else if(c=='*'||c=='/') return 4;
        else if(c=='^') return 5;
        else if(c=='(') return 0;
        else if(c==')') return 0;
        else return -1;
    }
}
