package com.how2java.tmall.test;

import com.how2java.tmall.pojo.Order;

public class TestDemo {
    public static void main(String[] args) {
//以创建5个student为例
        int count = 6;//student数量+1
        Order[] student = new Order[count];
        for (int i = 1; i < count; i++) {

            student[i] = new Order();
            student[i].setId(new Integer(3));

            System.out.println(student[i]);
        }
    }
}