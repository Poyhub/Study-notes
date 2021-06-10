package com.study.day4;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //题目：不死神兔
        int month;
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入月数：");
        month=sc.nextInt();
        Sum(month);
        System.out.println("第"+month+"月，兔子的总对数有："+Sum(month)+"对");


    }
    private static int Sum(int month) {
        if(month==1||month==2) {//第1月和第2月单独计算
            return 1;
        }else {
            return Sum(month-1)+Sum(month-2);//从第3月开始，每月兔子的总数等于上两月兔子总数之和
        }
    }
}
