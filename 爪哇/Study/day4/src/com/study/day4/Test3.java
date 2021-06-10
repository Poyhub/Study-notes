package com.study.day4;

public class Test3 {
    public static void main(String[] args) {
        //题目：逢7跳过
        for (int i = 1; i <= 100; i++) {
            if ((i % 7 == 0) || (i % 10 == 7) || (i / 10 % 10 == 7)) {
                System.out.println("[过！]");
            } else {
                System.out.print("[");
                System.out.print(i);
                System.out.print("]");
                System.out.println("");

            }
        }
    }
}