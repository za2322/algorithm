package com.baekjoon.algorithm.bruteforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No2309_BruteForce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        int a = 0;
        int b = 0;

        for (int i = 0; i < 9; i++) {
            arr.add(sc.nextInt());
            sum += arr.get(i);
        }

        Collections.sort(arr);

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                int ans = sum - arr.get(i) - arr.get(j);

                if (ans == 100) {
                    a = i;
                    b = j;

                    for (int q = 0; q < 9; q++) {
                        if (q != a && q != b) {
                            System.out.println(arr.get(q));
                        }
                    }
                    return;
                }
            }
        }
    }
}
