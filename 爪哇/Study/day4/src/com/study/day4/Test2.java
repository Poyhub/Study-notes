package com.study.day4;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //题目：减肥问题（Switch方法）

        int week;
        Scanner sc = new Scanner(System.in);
        System.out.print("想查找星期几：");
        week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("周一：跑步");
                break;
            case 2:
                System.out.println("周二：游泳");
                break;

            case 3:
                System.out.println("周三：慢走");
                break;

            case 4:
                System.out.println("周四：动感单车");
                break;

            case 5:
                System.out.println("周五：拳击");
                break;

            case 6:
                System.out.println("周六：爬山");
                break;

            case 7:
                System.out.println("周日：好好吃一顿");
                break;

            default:
                System.out.println("您输入的参数有误！");
                break;

        }
    }
}
