package com.study.day2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重(kg)：");
        float weight=sc.nextFloat();
        System.out.println("请输入身高(m)：");
        float heigh=sc.nextFloat();
        bmi=weight/(heigh*heigh);
        System.out.println("当前BMI为："+bmi);
        if (bmi<18.5){
            System.out.println("身体状态是：体重过轻");
        }
        else if (bmi<24){
            System.out.println("身体状态是：正常范围");
        }
        else if (bmi<27) {
            System.out.println("身体状态是：体重过重");
        }
        else if (bmi<30) {
            System.out.println("身体状态是：轻度肥胖");
        }
        else if (bmi<35) {
            System.out.println("身体状态是：中度肥胖");
        }
        else{
            System.out.println("身体状态是：重度肥胖");
        }

    }
}
