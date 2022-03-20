package com.company.ArrayDataStructure;

public class ArrayADT {
    public int SIZE; // total size of the array
    public int LENGTH; // array filled length

    private int[] array;

    ArrayADT() {
        SIZE = 10;
        array = new int[SIZE];
        LENGTH = 0;
    }
    ArrayADT(int size) {
        SIZE = size;
        array = new int[SIZE];
        LENGTH = 0;
    }

    public void display() {
        /**
         * Display list
         * */
        for(int i=0;i<LENGTH;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }
    public void add(int element) {
        /**
         * Appends / adds element at end of list
         * */
        array[LENGTH] = element;
        ++LENGTH;
    }
    public void insert(int index,int element) {
        /**
         * Inserts element at some particular index
         * Index must be less than Size of the array
         * */
        ++LENGTH;
        if(index<LENGTH) {
            for(int i=LENGTH-1;i>index;i--) {
                array[i] = array[i-1];
            }
            array[index] = element;
        }
    }
    public void delete(int index) {
        /**
         * Deletes element at particular index
         * */
        if(index<LENGTH) {
            for(int i=index+1;i<LENGTH;i++) {
                array[i-1] = array[i];
            }
            --LENGTH;
        }
    }
    public int lsearch(int key) {
        /**
         * Searches for particular key and returns index
         * -1 if element not found
         * */
        for(int i=0;i<LENGTH;i++)
            if(key==array[i])
                return i;
        return -1;
    }
    public int bsearch(int key) {
        /**
         * Searches for particular key and returns index
         * -1 if element not found
         * ONLY FOR SORTED ARRAY
         * */
        int l,h;
        l = 0;
        h = LENGTH-1;
        while(l<=h) {
            int mid = (l+h)/2;
            if(array[mid]==key) return mid;
            else if(array[mid]>key) h = mid-1;
            else l = mid + 1;
        }
        return -1;
    }
    public int get(int index) {
        /**
         * Gets element from particular index
         * */
        if(index<LENGTH)
            return array[index];
        return -1;
    }
    public void set(int index,int element) {
        /**
         * Set element at particular index
         * */
        if(index<LENGTH)
            array[index] = element;
    }
    public int max() {
        /**
         * Finds max number
         * */
        int max = Integer.MIN_VALUE;
        for(int i:array) max = Math.max(i,max);
        return max;
    }
    public int min() {
        /**
         * Finds min number
         * */
        int min = Integer.MAX_VALUE;
        for(int i:array) min = Math.min(i,min);
        return min;
    }
    public void reverse() {
        /**
         * Reverses an array
         * */
        int i,j;
        i = 0;
        j = LENGTH-1;

        while(i<j) {
            int t = array[i];
            array[i] = array[j];
            array[j] = t;
            i++;
            j--;
        }
    }
    public void lshift(int sno) {
        int s = 0;
        while (s<sno) {
            int t = array[0];
            for(int i=1;i<LENGTH;i++) {
                array[i-1] = array[i];
            }
            array[LENGTH-1] = t;
            ++s;
        }
    }
    public void rshift(int sno) {
        int s = 0;
        while(s<sno) {
            int t = array[LENGTH-1];
            for(int i=LENGTH-1;i>0;i--) {
                array[i] = array[i-1];
            }
            array[0] = t;
            ++s;
        }
    }
}

class ArrayADTMain {
    public static void main(String[] args) {
        ArrayADT arrayADT = new ArrayADT(5);
        arrayADT.add(23);
        arrayADT.add(63);
        arrayADT.add(34);
        arrayADT.add(86);

        arrayADT.insert(2,1001);
        arrayADT.display();

        arrayADT.delete(2);
        arrayADT.display();

        System.out.println(arrayADT.lsearch(34));

        arrayADT.delete(0);
        arrayADT.delete(0);
        arrayADT.delete(0);
        arrayADT.delete(0);

        System.out.println(arrayADT.LENGTH);

        arrayADT.display();
        arrayADT.add(12);
        arrayADT.add(23);
        arrayADT.add(34);
        arrayADT.add(45);
        arrayADT.add(556);
        arrayADT.display();

        System.out.println(arrayADT.bsearch(23));
        System.out.println(arrayADT.bsearch(233));

        System.out.println(arrayADT.get(3));
        arrayADT.set(3,1111);
        arrayADT.display();

        System.out.println(arrayADT.min());
        System.out.println(arrayADT.max());

        arrayADT.reverse();
        arrayADT.display();

        arrayADT.lshift(1);
        arrayADT.display();

        arrayADT.rshift(1);
        arrayADT.display();
    }
}
