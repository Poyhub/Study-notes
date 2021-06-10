package com.study.student;

import com.study.day5.Phone;

public class Student_test {
    public static void main(String[] args) {
        Student student=new Student();
        Phone phone=new Phone();
        student.Study();
        student.Work();
        student.age=10;
        student.name="张三";
        System.out.println(student.name);
        System.out.println(student.age);
        phone.sendMessage();
        phone.Call();
    }
}
 