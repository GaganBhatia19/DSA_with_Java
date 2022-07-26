package com.company.Backtracking;

import java.util.*;

public class Backtracking3_PrintSubsequences {

    static void printSubsequence(int[]arr, int idx, List<Integer> dataStructure) {
        if(idx==arr.length) {
            System.out.println(dataStructure.toString());
            return;
        }
        // add that arr element in data structure
        dataStructure.add(arr[idx]);
        // now pick and try
        printSubsequence(arr,idx+1,dataStructure);
        // don't pick -- remove the last added element
        dataStructure.remove(dataStructure.size()-1);
        // try
        printSubsequence(arr,idx+1,dataStructure);
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8};
        printSubsequence(arr,0,new ArrayList<>());
//        printSubsequenceReverse(arr,0,new ArrayList<>());
    }

    static void printSubsequenceReverse(int[]arr, int idx, List<Integer> dataStructure) {
        if(idx==arr.length) {
            System.out.println(dataStructure.toString());
            return;
        }
        // don't pick
        printSubsequenceReverse(arr,idx+1,dataStructure);
        dataStructure.add(arr[idx]);
        printSubsequenceReverse(arr,idx+1,dataStructure);;
        dataStructure.remove(dataStructure.size()-1);
    }
}
