package com.bwie.test.Test;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Day1_4 {

    public static void main(String[] args) {
        int i=0;  //保存百位上的数
        int j=0;  //保存十位上的数
        int k=0;  //保存个位上的数
        int t=0;  //保存数字个数
        for(i=1;i<=4;i++){
        for(j=1;j<=4;j++){
        for(k=1;k<=4;k++){
            if(i!=j && j!=k && i!=k){
                t+=1;
                System.out.println(i*100+j*10+k);
            }
        }
    }
}
System.out.println ("一共有"+t+"个");
    }
}
