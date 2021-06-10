package com.study.day4;

public class Test7 {
    public static void main(String[] args) {
        //题目：数组比较
        int [] arr1={2,3,4,5};
        int [] arr2={2,3,4,5};
        boolean res=compare(arr1,arr2);
        System.out.println("res:"+res);


    }
    public static boolean compare(int [] arr1, int [] arr2){
        if (arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i <= arr1.length-1; i++) {
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;

    }
}
