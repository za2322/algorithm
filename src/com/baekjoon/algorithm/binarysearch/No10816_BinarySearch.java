package com.baekjoon.algorithm.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 정렬 : BinarySearch
public class No10816_BinarySearch {

    public static int lower_bound(ArrayList<Integer> array, int num) {
        int start, end, mid;
        start = 0;
        end = array.size() - 1;

        while (end - start >= 0) {
            mid = (start + end) / 2;
            if (num <= array.get(mid)) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static int upper_bound(ArrayList<Integer> array, int num) {
        int start, end, mid;
        start = 0;
        end = array.size() - 1;

        while (end - start >= 0) {
            mid = (start + end) / 2;
            if (num >= array.get(mid)) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        int m = sc.nextInt();

        ArrayList<Integer> testCase = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            testCase.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            int num = testCase.get(i);
            sb.append(upper_bound(arr, num) - lower_bound(arr, num)).append(" ");
        }
        System.out.println(sb);
    }
}
