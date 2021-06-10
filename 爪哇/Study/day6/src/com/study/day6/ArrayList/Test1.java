package com.study.day6.ArrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Student stu1 = new Student("扬州;",19);
        Student stu2 = new Student("纷纷",73);
        Student stu3 = new Student("分散",13);

        ArrayList<Student> list=new ArrayList<>();


        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.print("姓名:"+stu.getName()+" ");
            System.out.print("年龄:"+stu.getAge());
            System.out.println("");
        }
    }
}
