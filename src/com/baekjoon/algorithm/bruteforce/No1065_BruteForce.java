package com.baekjoon.algorithm.bruteforce;

import java.util.ArrayList;
import java.util.Scanner;

public class No1065_BruteForce {

    public static int arithmetic_sequence(int num) {
        int cnt = 0;

        if (num < 100) {
            return num;
        }
        else {
            if (num == 1000) {
                num = 999;
            }

            cnt = 99;

            for (int i = 100; i <= num; i++) {
                int hun = (i / 10) / 10;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = arithmetic_sequence(n);
        System.out.println(result);
    }
}
