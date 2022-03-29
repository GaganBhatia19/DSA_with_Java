package com.company.ArrayDataStructure;

public class Array7_mergeArrays {
    public static void main(String[] args) {
        int[]arr1 = {12,34,45,56};
        int[]arr2 = {2, 11, 23, 67, 78};
        int[]arr3 = merge(arr1,arr2);

        Array1_getter_setter.display(arr1);
        Array1_getter_setter.display(arr2);
        Array1_getter_setter.display(arr3);
    }

    public static int[] merge(int[]arr1,int[]arr2) {
        int[]arr3 = new int[arr1.length+arr2.length];
        int i,j,k;
        i = j = k = 0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i]>arr2[j]) arr3[k++] = arr2[j++];
            else arr3[k++] = arr1[i++];
        }
        for(;i<arr1.length;i++,k++) arr3[k] = arr1[i];
        for(;j<arr2.length;j++,k++) arr3[k] = arr2[j];
        return arr3;
    }
}
