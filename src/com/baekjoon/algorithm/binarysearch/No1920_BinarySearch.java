package com.baekjoon.algorithm.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 정렬 : BinarySearch
public class No1920_BinarySearch {

    public static boolean binarySearch(ArrayList<Integer> array, int num) {
        int start, end, mid;
        start = 0;
        end = array.size() - 1;
        mid = (start + end) / 2;

        while (end - start >= 0) {
            if (array.get(mid) == num) {
                return true;
            }
            else if (array.get(mid) < num) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

            mid = (start + end) / 2;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
            if (binarySearch(arr, testCase.get(i))) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
