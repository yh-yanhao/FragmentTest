package com.bwie.test.Test;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class ErWeishuzu {

    //创建类
    public static void main(String[] args) {
        //主方法
        char a[][] = new char[3][4];
        //定义二维数组
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //循环遍历数组中的每个元素
                a[i][j]='*';
                //初始化数组内容
                System.out.print((char)a[i][j]);
                //将数组中的元素输出
            }
            System.out.println();
            //输出空格
        }
    }
}
