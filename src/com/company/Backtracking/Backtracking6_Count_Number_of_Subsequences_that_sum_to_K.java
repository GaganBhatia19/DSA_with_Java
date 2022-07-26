package com.company.Backtracking;

public class Backtracking6_Count_Number_of_Subsequences_that_sum_to_K {
    public static void main(String[] args) {
        int[]arr = {1,2,1};
        int target = 2;

        System.out.println(countSequences(arr, 0, 0, target));
    }
    static int countSequences(int[]arr, int idx, int currentSum, int targetSum) {
        if(idx==arr.length) {
            if(currentSum==targetSum) return 1;
            return 0;
        }
        currentSum+=arr[idx];
        int l = countSequences(arr, idx+1, currentSum, targetSum);

        currentSum-=arr[idx];
        int r = countSequences(arr, idx+1, currentSum, targetSum);

        return r + l;
    }
}
