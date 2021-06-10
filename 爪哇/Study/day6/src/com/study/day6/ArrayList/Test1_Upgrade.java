package com.study.day6.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1_Upgrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Student> list=new ArrayList<>();
        addStudent(list,sc);
        addStudent(list,sc);
        addStudent(list,sc);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名："+list.get(i).getName()+" 年龄："+list.get(i).getAge());
        }


    }
    public static void addStudent(ArrayList <Student> list,Scanner sc){
            System.out.println("请输入姓名:");
            String sc_name=sc.next();
            System.out.println("请输入年龄:");
            int sc_age=sc.nextInt();

            Student stu = new Student(sc_name, sc_age);
            list.add(stu);
    }
}
