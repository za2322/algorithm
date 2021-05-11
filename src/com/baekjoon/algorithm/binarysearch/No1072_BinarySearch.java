package com.baekjoon.algorithm.binarysearch;

import java.util.Scanner;

// 정렬 : BinarySearch
public class No1072_BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextInt();
        long y = sc.nextInt();
        long z = y * 100 / x;

        if (z >= 99) {
            System.out.println(-1);
        }
        else {
            long left = 1;
            long right = x;
            long ans = 0;

            while (right >= left) {
                long mid = (left + right) / 2;
                long cx = x + mid;
                long cy = y + mid;
                long cz = cy * 100 / cx;

                if (cz > z) {
                    ans = mid;
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
