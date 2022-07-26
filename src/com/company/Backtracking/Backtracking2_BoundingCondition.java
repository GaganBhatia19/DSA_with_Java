package com.company.Backtracking;

import java.util.Dictionary;

public class Backtracking2_BoundingCondition {

    public static void main(String[] args) {

        String[] strings = {"B1","B2","G1"};

        new Solution().solution(strings);

    }
    static class Solution {

        public void solution(String[]strings) {

            solutionUtil(strings,0);

        }
        private void solutionUtil(String[]strings, int idx) {
            if(idx == strings.length) {
                for (String s:strings) System.out.print(s);
                System.out.println();
                return;
            }
            for(int i=idx;i<strings.length;i++) {

                swap(strings, idx, i);

                if(!strings[strings.length/2].equals("G1")) // bounding condition/ constraint
                    solutionUtil(strings, idx + 1);

                swap(strings, idx, i);


            }
        }
        private void swap(String[]strings, int i, int j) {
            String t = strings[i];
            strings[i] = strings[j];
            strings[j] = t;
        }
    }
}
