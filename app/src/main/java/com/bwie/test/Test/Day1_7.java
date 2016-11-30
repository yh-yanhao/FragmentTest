package com.bwie.test.Test;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Day1_7 {

    public static void main(String[] args) {
        int n = 10;
        int[] last = new int[n];
        for (int i = 0; i < n; ++i)
            last[i] = 1;
        int[] current = last.clone();
        System.out.print("1\n1 1\n");

        for (int i = 3; i <= n; ++i) {
            for (int j = 1; j < i - 1; ++j) {
                current[j] = last[j] + last[j - 1];
            }
            print(current, i);

            int[] t = current;
            current = last;
            last = t;
        }

    }

    static void print(int[] array, int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

}
