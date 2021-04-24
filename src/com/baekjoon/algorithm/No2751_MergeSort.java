package com.baekjoon.algorithm;

import java.util.Scanner;

// 정렬 : 합병정렬
public class No2751_MergeSort {

    public static void partition(int[] array, int[] tmpArray, int left, int right) {
        if (left == right)
            return;

        int mid = (left + right) / 2;

        partition(array, tmpArray, left, mid);
        partition(array, tmpArray, mid + 1, right);
        merge(array, tmpArray, left, right);
    }

    public static void merge(int[] array, int[] tmpArray, int left, int right) {
        int L, R, K, mid;
        mid = (left + right) / 2;
        L = left;
        R = mid + 1;
        K = left;

        while (L <= mid && R <= right)
            tmpArray[K++] = array[L] <= array[R] ? array[L++] : array[R++];

        if (L > mid) {
            for (int a = R; a <= right; a++) {
                tmpArray[K++] = array[a];
            }
        }
        else {
            for (int a = L; a <= mid; a++) {
                tmpArray[K++] = array[a];
            }
        }

        for (int a = left; a <= right; a++) {
            array[a] = tmpArray[a];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testNum = sc.nextInt();

        int[] arr = new int[testNum];
        int[] tmpArr = new int[testNum];

        for (int i = 0; i < testNum; i++) {
            int a = sc.nextInt();

            arr[i] = a;
        }

        partition(arr, tmpArr, 0, testNum - 1);

        for (int i = 0; i < testNum; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
