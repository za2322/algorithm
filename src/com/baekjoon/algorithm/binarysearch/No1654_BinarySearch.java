package com.baekjoon.algorithm.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 정렬 : BinarySearch
public class No1654_BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Long> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLong());
        }

        Collections.sort(arr);

        long start = 1;
        long end = arr.get(n - 1);
        long ans = 0;

        while (end - start >= 0) {
            long sum = 0;
            long mid = (start + end) / 2;

            for (int i = 0; i < n; i++) {
                if (arr.get(i) / mid > 0) {
                    sum += arr.get(i) / mid;
                }
                else {
                    sum += 0;
                }
            }

            if (sum >= m) {
                start = mid + 1;

                if (ans < mid) {
                    ans = mid;
                }
            }
            else {
                end = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
