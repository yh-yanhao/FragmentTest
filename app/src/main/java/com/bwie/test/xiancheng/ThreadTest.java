package com.bwie.test.xiancheng;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class ThreadTest extends Thread{

    /*
    * 覆写run()方法，定义该线程需要执行的代码
    */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
