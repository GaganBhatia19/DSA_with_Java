package com.company.ArrayDataStructure;

public class Array2_add_max_min {
    public static void main(String[] args) {
        int[]arr = new int[5];
        //add
        arr[0] = 12;
        arr[1] = 45;
        arr[4] = 78;
        Array1_getter_setter.display(arr);

        //max
        int max = Integer.MIN_VALUE;
        for(int i:arr) max = Math.max(i,max);
        System.out.println(max);

        //min
        int min = Integer.MAX_VALUE;
        for(int i:arr) min = Math.min(i,min);
        System.out.println(min);
    }
}
