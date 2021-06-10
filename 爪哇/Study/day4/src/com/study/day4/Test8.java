package com.study.day4;

import java.util.Scanner;

public class Test8 {
    //题目：数组查询
    public static void main(String[] args) {
        int [] arr1={34,65,232,75,13,64,86};
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入查找的值：");
        int scn=sc.nextInt();
        int res=select(arr1,scn);
        if (res==-1){
            System.out.println("对不起，没有查到相关数据！");
        }
        else {
            System.out.println("当前查找的数据索引值为："+res);
        }

    }
    public static int select(int [] arry,int a){
        for (int i = 0; i <= arry.length-1; i++) {
            if (arry[i]==a){
                return i;
            }

        }
        return -1;
    }
}
