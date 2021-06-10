package com.study.day4;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("打分"+(i+1)+":");
            arr[i]= sc.nextInt();
        }
        //获取最高分
        int max=getMax(arr);
        //获取最低分
        int min=getMin(arr);
        //获取累加和
        int sum=getSum(arr);
        //计算平均值
        int avg=(sum-max-min)/(arr.length-2);
        System.out.println("该选手平均分为："+avg);
    }
    //最大值
    public static int getMax(int [] arr){
        int max=arr[0];
        int max_i=0;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i]>max){
                max=arr[i];
                max_i=i;
            }

        }
        return max;


    }
    //最小值
    public static int getMin(int [] arr){
        int min=arr[0];
        int min_i=0;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i]<min){
                min=arr[i];
                min_i=i;
            }

        }
        return min;


    }
    //累加和算平均分
    public static int getSum(int [] arr){
        int sum=0;
        for (int i = 0; i <= arr.length-1; i++) {
            sum+=arr[i];
        }
        return sum;

    }

}
