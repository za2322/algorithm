package com.baekjoon.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 정렬 : Collections Sort
public class No2751_CollectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testNum = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < testNum; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        for (int i = 0; i < testNum; i++) {
            sb.append(arr.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
