package com.bwie.test.Test;

import java.util.Scanner;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Day1_2 {

    public static void main(String[] args) {
        //数字
        int digital=0;
        //字母
        int character=0;
        //空格
        int other=0;
        //其他
        int blank=0;
        //在控制台输入一串字符
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0'&&ch[i]<='9'){
                digital++;
            }else if((ch[i]>='a'&&ch[i]<='z')||ch[i]>='A'&&ch[i]<='Z'){
                character++;
            }else if(ch[i]==' '){
                blank++;
            }else{
                other++;
            }
        }
        System.out.println("数字个数："+digital);
        System.out.println("英文字母个数："+character);
        System.out.println("空格个数："+blank);
        System.out.println("其他字符个数："+other);
    }
}
