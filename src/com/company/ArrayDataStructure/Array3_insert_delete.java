package com.company.ArrayDataStructure;

public class Array3_insert_delete {
    public static void main(String[] args) {
        int[]arr = {12,31,55,1,34};
        Array1_getter_setter.display(arr);
        arr = insert(arr,2,9999);
        Array1_getter_setter.display(arr);
        arr = delete(arr,2);
        Array1_getter_setter.display(arr);
    }
    static int[] insert(int[]arr,int index,int element) {
        int[]arr1 = new int[arr.length+1];
        System.arraycopy(arr,0,arr1,0,arr.length);
        for(int i=arr1.length-1;i>index;i--)
            arr1[i] = arr1[i-1];
        arr1[index] = element;
        return arr1;
    }
    static int[] delete(int[]arr,int index) {
        int[]arr1 = new int[arr.length-1];
        for(int i=index+1;i<arr.length;i++) {
            arr[i-1] = arr[i];
        }
        System.arraycopy(arr,0,arr1,0,arr.length-1);
        return arr1;
    }
}
