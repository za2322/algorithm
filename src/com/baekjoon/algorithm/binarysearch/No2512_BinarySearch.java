package com.baekjoon.algorithm.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 정렬 : BinarySearch
public class No2512_BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
            sum += arr.get(i);
        }

        Collections.sort(arr);

        int m = sc.nextInt();

        if (sum <= m) {
            System.out.println(arr.get(n - 1));
        }
        else {
            int start = 1;
            int end = arr.get(n - 1);
            int ans = 0;

            while (end - start >= 0) {
                int sum2 = 0;
                int mid = (start + end) / 2;

                for (int i = 0; i < n; i++) {
                    if (arr.get(i) - mid >= 0) {
                        sum2 += mid;
                    }
                    else {
                        sum2 += arr.get(i);
                    }
                }

                if (sum2 <= m) {
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
}
