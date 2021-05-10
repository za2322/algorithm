package com.baekjoon.algorithm.binarysearch;

import java.util.ArrayList;
import java.util.Scanner;

// 정렬 : BinarySearch
public class No1300_BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int left = 1;
        int right = k;
        int ans = 0;

        while (right >= left) {
            int cnt = 0;
            int mid = (left + right) / 2;

            for (int i = 1; i <= n; i++) {
                cnt += Math.min(mid / i, n);
            }

            if (cnt < k) {

                left = mid + 1;
            }
            else {
                ans = mid;
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
