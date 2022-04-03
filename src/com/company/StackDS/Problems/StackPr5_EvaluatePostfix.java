package com.company.StackDS.Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class StackPr5_EvaluatePostfix {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String postfixExpression = br.readLine();// (a+b)*c-d^e^f
        int result = postfixEvaluate(postfixExpression); // 35*62/+4-
        System.out.println("Answer: "+result);
    }
    public static int postfixEvaluate(String postfixExpression) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int i=0;
        while(i<postfixExpression.length()) {
            if(isOperand(postfixExpression.charAt(i))) {
                // 1. if the ith element is a operand then push it into stack by converting to string and string to integer and pushing integer to stack
                stack.push(Integer.parseInt(String.valueOf(postfixExpression.charAt(i++))));
            } else {
                // 2. If the ith element is an operator then
                if(!stack.isEmpty()) {
                    int val1 = stack.pop(); // pop head element from stack
                    int val2 = stack.pop(); // pop another head element from stack
                    int res = operation(postfixExpression.charAt(i++),val1,val2); // perform operation on the two poped values acc. to the operator we have
                    stack.push(res); // store the result into stack
                } else i++;
            }
        }
        return stack.pop();
    }
    public static int operation(char symbol,int val1,int val2) {
        int res = 0;
        switch (symbol){
            case '+':
                res = val2 + val1;
                break;
            case '-':
                res = val2 - val1;
                break;
            case '*':
                res = val2 * val1;
                break;
            case '/':
                res = val2 / val1;
                break;
        }
        return res;
    }
    public static boolean isOperand(char c) {
        if(c=='+'||c=='-'||c=='/'||c=='*') return false;
        else return true;
    }
}
