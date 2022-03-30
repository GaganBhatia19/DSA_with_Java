package com.company.StackDS.Problems;

import java.io.*;
import java.util.*;

public class StackPr1_BalancedParanthesis {

    public static boolean isBalanced(String expression) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(char c:expression.toCharArray()) {
            if (c=='(') {
                stack.push('(');
            } else if (c==')') {
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();
        String result = isBalanced(expression)?"Balanced":"Not Balanced";
        System.out.println(expression + " is " + result);
    }
}
