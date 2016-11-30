package com.bwie.test.Test;

import java.util.Scanner;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Day1_3 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入要计算的月数:");
        int m=input.nextInt();
        int i=1;
        int[] arr=new int[m+1];
        for(i=1;i<m+1;i++)
        {
            if(i==1|i==2)
                arr[1]=arr[2]=1;
            else
                arr[i]=arr[i-2]+arr[i-1];
        }
        for(i=1; i<m+1;i++)
        {
            System.out.println("第" + i +"月的兔子数目为:" + arr[i]);
        }

    }

}
