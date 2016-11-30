package com.bwie.test.Test1130;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public abstract class Person {

    private String name;  // 私有变量

    public String getName() {  // Getter方法
        return name;
    }
    public void setName(String name) {  //Setter方法
        this.name = name;
    }

    public Person(String name) {  // 构造函数，用于初始化name
        super();
        this.name = name;
    }
    public abstract String getDesc();  // 抽象类中的抽象方法。  只有声明，没有具体实现。

    public String toString(){      // toString方法覆盖了Object类的toString方法
        return name + getDesc();
    }
}
