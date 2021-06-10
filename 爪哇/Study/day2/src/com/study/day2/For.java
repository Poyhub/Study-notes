package com.study.day2;

public class For {
    public static void main(String[] args) {
        int geshu=0;
        for (int i=100;i<1000;i++){
            //三位数由abc构成；
            int c=i%10;
            int b=i/10%10;
            int a=i/100;
            int sum=(c*c*c)+(b*b*b)+(a*a*a);
            if (sum==i){
                geshu++;
                System.out.println(i);
            }
        }
        System.out.println(geshu);

    }
}
