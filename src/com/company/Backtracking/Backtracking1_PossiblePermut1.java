package com.company.Backtracking;

public class Backtracking1_PossiblePermut1 {
    public static void main(String[] args) {
        char[] str = {'A','B','C'};
        new Solution().permute(str,0);
    }
    static class Solution {
        public void permute(char[]str,int idx) {
            if(idx == str.length) {
                for (char c : str) System.out.print(c);
                System.out.println();
                return;
            }
            for(int i=idx;i<str.length;i++) {
                // do
                swap(str, idx, i);
                // recursion
                permute(str, idx + 1);
                // undo
                swap(str, idx, i);
            }

        }
        private void swap(char[]str,int i1, int i2) {
            char t = str[i1];
            str[i1] = str[i2];
            str[i2] = t;
        }
    }

}
