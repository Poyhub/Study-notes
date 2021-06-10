package com.study.day2;

import java.util.Scanner;

public class runnian {
    public static void main(String[] args) {
        //闰年判断标准(满足任何一个)
        //1. 如果能够被4整除，但是不能被100整除
        //2. 能够被400整除
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year=sc.nextInt();
        if ((year%4==00&&year%100!=0)||(year%400==0)){
            System.out.println(year+"是闰年");

        }
        else {
            System.out.println(year+"不是闰年");
        }

    }
}
