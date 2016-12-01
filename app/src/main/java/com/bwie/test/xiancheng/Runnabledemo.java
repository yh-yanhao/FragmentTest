package com.bwie.test.xiancheng;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Runnabledemo {

    public static void main(String[] args) {
        RunnableTest my=new RunnableTest();
        new Thread(my).start();
        new Thread(my).start();
    }
}
