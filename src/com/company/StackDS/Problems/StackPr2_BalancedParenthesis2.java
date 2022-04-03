package com.company.StackDS.Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class StackPr2_BalancedParenthesis2 {

    public static boolean isBalanced(String expression) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(char c:expression.toCharArray()) {
            if(c=='{'||c=='('||c=='[')
                stack.push(c);
            else if(c=='}'||c==')'||c==']') {
                if(stack.isEmpty()) return false;
                else {
                    char popEl = stack.pop();
                    if(popEl=='[' && c==']') continue;
                    else if(popEl=='(' && c==')') continue;
                    else if(popEl=='{' && c=='}') continue;
                    else return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine(); //{([a+b]*[c-d])/e} //{([a+b]*[c-d]}/e)
        String result = isBalanced(expression)?"Balanced":"Not Balanced";
        System.out.println(expression+" is " + result);
    }
}
