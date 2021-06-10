package com.study.day2;

public class zhumulangmafeng {
    public static void main(String[] args) {
        double paper=0.1;
        double zf=8844430;
        int i=0;
        while (paper<=zf){
            paper*=2;
            i++;
        }
        System.out.println("折叠"+i+"次，就可以折成珠穆朗玛峰的高度");
    }
}
