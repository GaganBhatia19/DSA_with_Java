package com.company.StackDS.Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class StackPr6_PrefixToInfix {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String prefix = br.readLine();
        System.out.println(convert(prefix));// *-A/BC-/AKL
    }
    public static String convert(String prefix) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        int i = prefix.length()-1; // traverse from right to left
        while(i>-1) {
            if(isOperand(prefix.charAt(i))) {
                stack.push(String.valueOf(prefix.charAt(i--)));
            } else {
                String s1 = stack.pop();
                String s2 = stack.pop();
                String res = makeExp(s1,prefix.charAt(i--),s2);
                stack.push(res);
            }
        }
        return stack.pop();
    }
    public static boolean isOperand(char c) {
        if(c=='-'||c=='+'||c=='*'||c=='/') return false;
        else return true;
    }
    public static String makeExp(String s1,char operator,String s2) {
        return "("+s1+operator+s2+")";
    }
}

