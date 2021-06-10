package com.study.day6.ArrayList;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println("删除元素前的集合："+list);

        //删除指定元素
/*        boolean res1 = list.remove("张三");
        System.out.println("res1："+res1);
        System.out.println("删除元素后的集合："+list);
        boolean res2 = list.remove("灭绝师太");
        System.out.println("res2："+res2);
        System.out.println("删除元素后的集合："+list);

        String removeE = list.remove(1);
        System.out.println("removeE："+removeE);
        System.out.println("删除元素后的集合"+list);*/
        //设置指定元素
        /*String set1 = list.set(1, "哈哈");
        System.out.println("set1:"+set1);
        System.out.println("设置元素后的集合"+list);*/


    }
}
