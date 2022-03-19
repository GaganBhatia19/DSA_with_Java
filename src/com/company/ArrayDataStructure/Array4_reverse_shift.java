package com.company.ArrayDataStructure;

public class Array4_reverse_shift {
    public static void main(String[] args) {
        int[]arr = {41,21,55,2,521,122};
        Array1_getter_setter.display(arr);
//        reverse(arr);
//        lshift(arr,4);
        rshift(arr,2);
        Array1_getter_setter.display(arr);
    }
    static void reverse(int[]arr) {
        int i,j;
        i = 0;
        j = arr.length-1;
        while(i<j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
    static void lshift(int[]arr,int s) {
        int shift = 0;
        while(shift<s) {
            int t = arr[0];
            for(int i=1;i<arr.length;i++) {
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = t;
            ++shift;
        }
    }
    static void rshift(int[]arr,int s) {
        int shift = 0;
        while(shift<s) {
            int t = arr[arr.length-1];
            for(int i=arr.length-1;i>0;i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = t;
            ++shift;
        }
    }
}
