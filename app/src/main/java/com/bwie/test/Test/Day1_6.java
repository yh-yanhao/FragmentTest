package com.bwie.test.Test;

import java.util.Scanner;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Day1_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (ch[0] == ch[4] && ch[1] == ch[3]) {
                System.out.print("此数是回文数:" + ch[i]);
            }
        }
    }
}
