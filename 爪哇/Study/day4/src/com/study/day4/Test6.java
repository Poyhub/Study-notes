package com.study.day4;

public class Test6 {
    public static void main(String[] args) {
        //题目：数组求和
        int []arr1={68,27,95,88,171,996,51,210};
        int len=arr1.length;
        int sum=0;
        for (int i = 0; i <= len-1; i++) {
            if ((arr1[i]%2)==0&&(arr1[i]/10%10!=7)&&(arr1[i]%10!=7)){
                System.out.println("["+arr1[i]+"]");
                sum+=arr1[i];

            }
            
        }
        System.out.println("和为："+sum);
        int a=5678;
        int b=a/10/100;//百位
        int d=a/10%10;//十位
        int c=a%10;//个位
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
