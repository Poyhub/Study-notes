package com.study.week4;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //题目：减肥问题（If...else方法）

        int week;
        Scanner sc=new Scanner(System.in);
        System.out.print("想查找星期几：");
        week= sc.nextInt();
        if (week==1){
            System.out.println("周一：跑步");
        }
        else if (week==2){
            System.out.println("周二：游泳");
        }
        else if (week==3){
            System.out.println("周三：慢走");
        }
        else if (week==4){
            System.out.println("周四：动感单车");
        }
        else if (week==5){
            System.out.println("周五：拳击");
        }
        else if (week==6){
            System.out.println("周六：爬山");
        }
        else if (week==7){
            System.out.println("周日：好好吃一顿");
        }
        else {
            System.out.println("您输入的参数有误！");
        }
    }
}
