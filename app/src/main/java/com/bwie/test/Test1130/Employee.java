package com.bwie.test.Test1130;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Employee extends Person{

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String getDesc() {
        // TODO Auto-generated method stub
        return " :a employee, salary is " + salary;
    }

}
