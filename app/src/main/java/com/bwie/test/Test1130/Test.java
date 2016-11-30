package com.bwie.test.Test1130;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person[] p=new Person[2];
        p[0]=new Student("Mark", "IT");
        p[1]=new Employee("Jerry", 2000);
        for (Person person : p) {
            System.out.println(person.getName()+person.getDesc());
        }
    }
}
