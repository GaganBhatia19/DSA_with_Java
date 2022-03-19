package com.company.ArrayDataStructure;

import java.util.Arrays;

public class Array5_searching {
    public static void main(String[] args) {
        int[]arr = {42,13,53,66,23};
        System.out.println(lsearch(arr,66));
        Arrays.sort(arr);
        Array1_getter_setter.display(arr);
        // for binary search array must be sorted
//        System.out.println(bsearch(arr,25));
        System.out.println(RBinarySearch(arr,0,arr.length-1,23));
    }
    static int RBinarySearch(int[]arr,int l,int h,int key) {
        if(l<=h) {
            int mid = (l+h)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]>key)
                return RBinarySearch(arr,l,mid-1,key);
            else if(arr[mid]<key)
                return RBinarySearch(arr,mid+1,h,key);
        }
        return -1;
    }
    static int bsearch(int[]arr,int key) {
        int l,h;
        l = 0;
        h = arr.length-1;
        while(l<=h) {
            int mid = (l+h)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key) l = mid+1;
            else if(arr[mid]>key) h = mid-1;
        }
        return -1;
    }
    static int lsearch(int[]arr,int key) {
        for(int i=0;i<arr.length;i++)
            if(arr[i]==key)
                return i;
        return -1;
    }
}
