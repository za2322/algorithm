package com.baekjoon.algorithm;

import java.util.Scanner;

// 정렬 : 삽입정렬
public class No2750_InsertionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testNum = sc.nextInt();

        int[] arr = new int[testNum];

        for (int i = 0; i < testNum; i++) {
            int a = sc.nextInt();

            arr[i] = a;
        }

        for (int i = 0; i < testNum - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }

        for (int i = 0; i < testNum; i++) {
            System.out.println(arr[i]);
        }
    }
}
