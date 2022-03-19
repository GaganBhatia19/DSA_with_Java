package com.company.ArrayDataStructure;

public class Array1_getter_setter {
    public static void main(String[] args) {
        int[]arr = {12,14,51,34,11,91,31};
        display(arr);

        //getter
        System.out.println(arr[3]);
        //setter
        arr[3] = 9999;

        display(arr);
    }
    static void display(int[]arr) {
        for(int i:arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
