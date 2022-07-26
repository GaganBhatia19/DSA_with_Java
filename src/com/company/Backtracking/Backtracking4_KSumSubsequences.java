package com.company.Backtracking;
import java.util.*;
public class Backtracking4_KSumSubsequences {
    public static void main(String[] args) {
        int[]arr = {1,2,1};
        int targetSum = 2;
        kSumSubsequence(arr, 0, new ArrayList<>(),0, targetSum);
    }
    static void kSumSubsequence(int[]arr, int idx, List<Integer> dataStructure, int currentSum, int target) {
        if(idx==arr.length) {
            if(currentSum==target) System.out.println(dataStructure.toString());
            return;
        }
        dataStructure.add(arr[idx]);
        currentSum+=arr[idx];
        kSumSubsequence(arr, idx+1, dataStructure, currentSum, target);
        dataStructure.remove(dataStructure.size()-1);
        currentSum-=arr[idx];
        kSumSubsequence(arr, idx+1, dataStructure, currentSum, target);
    }
}
