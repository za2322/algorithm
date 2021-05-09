package com.baekjoon.algorithm.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 정렬 : BinarySearch
public class No12015_BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0);

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num > arr.get(arr.size() - 1)) {
                arr.add(num);
            }
            else {
                int start = 1;
                int end = arr.size() - 1;

                while (end - start > 0) {
                    int mid = (start + end) / 2;

                    if (num > arr.get(mid)) {
                        start = mid + 1;
                    }
                    else {
                        end = mid;
                    }
                }

                arr.set(end, num);
            }
        }

//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(i + " - " + arr.get(i));
//        }
        System.out.println(arr.size() - 1);
    }
}
