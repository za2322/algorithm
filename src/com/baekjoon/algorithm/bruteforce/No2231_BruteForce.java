package com.baekjoon.algorithm.bruteforce;

import java.util.ArrayList;
import java.util.Scanner;

public class No2231_BruteForce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            int tmp = i;

            while (tmp >= 10) {
                int a = tmp % 10;
                tmp /= 10;
                ans += a;
            }
            ans += tmp;
            ans += i;

            if (ans == n) {
                System.out.println(i);
                return;
            }
            else {
                ans = 0;
                if (i == n) {
                    System.out.println(0);
                }
            }
        }
    }
}
