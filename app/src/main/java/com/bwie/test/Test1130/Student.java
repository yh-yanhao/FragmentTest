package com.bwie.test.Test1130;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Student extends Person{

    private String major; // 新增加的数据

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String name,String major) { // 构造函数用于初始化
        super(name);   // 调用超类构造函数
        this.major = major;
    }

    @Override
    public String getDesc() {  // 必须实现超类中的抽象方法
        // TODO Auto-generated method stub
        return " : a student, major is " + major;
    }
}
