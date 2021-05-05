package com.baekjoon.algorithm.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 정렬 : BinarySearch
public class No2110_BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), c = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        int start = 1;
        int end = arr.get(n - 1) - arr.get(0);
        int d = 0;
        int ans = 0;

        while (end - start >= 0) {
            int mid = (start + end) / 2;
            int first = arr.get(0);
            int cnt = 1;

            for (int i = 1; i < n; i++) {
                d = arr.get(i) - first;

                if (mid <= d) {
                    cnt++;
                    first = arr.get(i);
                }
            }

            if (cnt >= c) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
