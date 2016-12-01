package com.bwie.test.xiancheng;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class RunnableTest implements Runnable{

    private int count=10;

    @Override
    public void run() {
        while(count>0){
            synchronized (this) {
                //双保险
                if(count>0){
                    count--;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"余票："+count);
                }
            }
        }
    }
}
