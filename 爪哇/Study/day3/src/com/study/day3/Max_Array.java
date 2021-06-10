package com.study.day3;

public class Max_Array {
    public static void main(String[] args) {
        int maxs = 0;

        int [] arr2={1,2,444,5236,236,2356,234222,12,634,7542,643};
        int max = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]>max){
                max=arr2[i];
            }
        }
        System.out.println("最大值："+max);
    }
}
