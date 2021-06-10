package com.study.day3;

public class List_Arrary {
    public static void main(String[] args) {
        int [] arr1={5,6,7,8,9};
        ListArr(arr1);

    }
    public static void ListArr(int [] arr){

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print("[");
            System.out.print(arr[i]);
            System.out.print("]");
        }
    }
}
