package com.company.Backtracking;

public class Backtracking5_Find_If_A_Subsequence_With_Sum_Of_K_Exist {
    public static void main(String[] args) {
        int[]arr = {1,2,1};
        int target = 2;
        System.out.println(containsSubsequence(arr, 0, 0, target));
    }
    static boolean containsSubsequence(int[]arr, int idx, int currentSum, int targetSum) {
        if(idx==arr.length) {
            if(currentSum==targetSum) return true;
            return false;
        }
        currentSum+=arr[idx];// pick
        if(containsSubsequence(arr, idx+1, currentSum, targetSum)) return true;

        currentSum-=arr[idx];// not pick
        if(containsSubsequence(arr, idx+1, currentSum, targetSum)) return  true;
        return false;
    }
}
