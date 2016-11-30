package com.bwie.test.Test;

import java.util.Scanner;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Day1_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum+=recursion(i);
        }
        System.out.println(sum);
    }

    private static int recursion(int num){
        if(num==1){
            return num;
        }
        return num*recursion(num-1);
    }
}
