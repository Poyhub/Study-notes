package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Manager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //界面架构
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生:add");
            System.out.println("2 查看学生:query");
            System.out.println("3 修改学生:update");
            System.out.println("4 删除学生:delete");
            System.out.println("5 退出系统:quit");
            System.out.print("请输入你的选择：");
            String command = sc.nextLine();
            //switch判断用户命令
            switch (command) {
                case "add":
                    addStudent(students);
                    break;
                case "query":
                    queryStudent(students);
                    break;
                case "update":
                    updateStudent(students);
                    break;
                case "delete":
                    deleteStudent(students);
                    break;
                case "quit":
                    System.out.println("退出系统成功！");
                    System.exit(0);//推出虚拟机JVM
                default:
                    System.out.println("输入有误，请重新输入！");

            }

        }
    }

    /**
     * 修改学生信息
     * @param students 学生的集合容器，用于修改学生对象
     */
    public static void updateStudent(ArrayList<Student> students) {
        if (students.size()==0){
            System.out.println("学生信息为空，请先添加信息！");
            addStudent(students);
        }
        else {
            while (true){
                System.out.println("请输入要修改的学生学号：");
                Scanner sc = new Scanner(System.in);
                String sid=sc.next();
                boolean res_sid=isSidRepeat(sid, students);
                if (res_sid==true){
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        if (s.getSid().equals(sid)){
                            //！！！修改！！！
                            System.out.println("请输入修改的姓名：");
                            String name = sc.next();
                            System.out.println("请输入修改的年龄：");
                            String age = sc.next();
                            System.out.println("请输入修改的地址：");
                            String address = sc.next();
                            s.setName(name);
                            s.setAge(age);
                            s.setAddress(address);
                            System.out.println("修改学生成功！");
                            queryStudent(students);
                            return;

                        }
                    }



                }
                else {
                    System.out.println("没有找到该学生信息！");
                    System.out.println("您是否要继续修改？y/n");
                    String res_yn=sc.next();
                    if ("n".equals(res_yn)){
                        break;

                    }

                }
            }

        }

    }

    /**
     * 删除学生信息
     * @param students 学生的集合容器，用于删除学生对象
     */
    public static void deleteStudent(ArrayList<Student> students) {
        if (students.size()==0){
            System.out.println("学生信息为空，请先添加信息！");
            addStudent(students);
        }
        else {
            while (true){
                System.out.println("请输入要删除的学生学号：");
                Scanner sc = new Scanner(System.in);
                //判断学号是否存在
                String sid=sc.next();
                boolean res_sid=isSidRepeat(sid, students);
                if (res_sid==true){

                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        if (s.getSid().equals(sid)){
                            students.remove(s);
                            System.out.println("删除成功！");
                            return;
                        }
                    }

                }
                else {
                    System.out.println("没有找到该学生信息！");
                }
            }

        }
    }

    /**
     * 查询全部学生信息
     * @param students 学生的集合容器，用于查询学生对象
     */
    public static void queryStudent(ArrayList<Student> students) {
        //判断学生对象集合对象是否存在信息
        if (students.size()==0){
            System.out.println("学生信息为空，请先添加信息！");
        }
        else {
            
            //查询
            System.out.println("学生学号\t学生姓名\t学生年龄\t学生地址\t");
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                StringBuilder sb=new StringBuilder();
                sb.append(s.getSid()).append("\t\t").append(s.getName()).append("\t").append(s.getAge()).append("\t").append(s.getAddress()).append("\t");
                System.out.println(sb);
            }
        }

    }


    /**
     * 添加学生对象的功能逻辑
     *
     * @param students 学生的集合容器，用于添加学生对象
     */
    public static void addStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        String sid=null;
        while (true) {
            System.out.println("请输入学号：");
            sid = sc.next();
            boolean res_sid = isSidRepeat(sid, students);//判断学号是否重复
            if (res_sid == true) {
                System.out.println("对不起，学号存在！");
            }
            else //学号没有重复

                break;
        }


        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        String age = sc.next();
        System.out.println("请输入地址：");
        String address = sc.next();

        Student s = new Student(sid, name, age, address);
        students.add(s);
        System.out.println("添加学生成功！");


    }

    /**
     * 判断学生学号是否重复
     *
     * @param sid 接收的学号
     * @return true 重复 false 没重复
     */
    public static boolean isSidRepeat(String sid, ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            String res = students.get(i).getSid();
            if (res.equals(sid)) {
                return true;
            }
        }

        return false;
    }

}
