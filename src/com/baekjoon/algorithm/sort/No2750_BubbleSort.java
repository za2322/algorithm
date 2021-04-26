package com.baekjoon.algorithm.sort;

import java.util.Scanner;

// 정렬 : 버블정렬
public class No2750_BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testNum = sc.nextInt();

        int[] arr = new int[testNum];

        for (int i = 0; i < testNum; i++) {
            int a = sc.nextInt();

            arr[i] = a;
        }

        for (int i = testNum - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < testNum; i++) {
            System.out.println(arr[i]);
        }
    }
}
