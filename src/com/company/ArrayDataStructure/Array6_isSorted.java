package com.company.ArrayDataStructure;

public class Array6_isSorted {
    public static void main(String[] args) {
        int[]arr = {12,34,45,67,5,90,122};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int[]arr) {
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
}
