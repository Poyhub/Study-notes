package com.study.day4;

public class Test9 {
    public static void main(String[] args) {
        //题目：数组交换
        int[] arry = {10, 20, 30, 40, 50};
        System.out.print("原数组：");
        for (int i = 0; i <= arry.length - 1; i++) {
            if (i == arry.length - 1) {
                System.out.print("[" + arry[i] + "]");
            } else {
                System.out.print("[" + arry[i] + "],");

            }

        }
        for (int i = 0; i < arry.length / 2; i++) {
            int a = arry[i];
            arry[i] = arry[arry.length - 1 - i];
            arry[arry.length - 1 - i] = a;
        }

        System.out.println("");
        System.out.print("交换后：");
        for (int i = 0; i <= arry.length - 1; i++) {
            if (i == arry.length - 1) {
                System.out.print("[" + arry[i] + "]");
            } else {
                System.out.print("[" + arry[i] + "],");

            }

        }


    }
}
