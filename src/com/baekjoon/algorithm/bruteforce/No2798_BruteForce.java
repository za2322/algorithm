package com.baekjoon.algorithm.bruteforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No2798_BruteForce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int ans = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = arr.get(i) + arr.get(j) + arr.get(k);

                    if (sum == m) {
                        System.out.println(sum);
                        return;
                    }
                    else {
                        if (sum < m) {
                            if (ans < sum) {
                                ans = sum;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
