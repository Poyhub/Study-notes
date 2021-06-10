package com.study.day4;

public class Test5 {
    public static void main(String[] args) {
        //百钱百鸡
        for (int i = 0; i <= 20; i++) {
            for (int j=0;j<=33;j++){
                int z=100-i-j;
                if ((i*5)+(3*j)+(z/3)==100&&z%3==0){
                    System.out.print("鸡翁"+i);
                    System.out.print("鸡母"+j);
                    System.out.print("鸡雏"+z);
                    System.out.println("");
                }
            }

        }
    }
}
