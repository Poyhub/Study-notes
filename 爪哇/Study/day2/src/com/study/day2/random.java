package com.study.day2;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-101的数字：");
        int num=r.nextInt(100)+1;
        while (true){
        int user_car= sc.nextInt();
        if (user_car>num){
            System.out.println("猜大了！");

        }
        else if (user_car<num){
            System.out.println("猜小了！");
        }

        else {
            System.out.println("猜中了！！！！！");
            break;

        }
        }
    }
}
