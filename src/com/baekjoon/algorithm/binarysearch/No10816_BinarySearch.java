package com.baekjoon.algorithm.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 정렬 : BinarySearch

// Lower bound
// 찾고자 하는 값 이상이 처음 나타나는 위치를 반환한다.
// 같은 원소가 여러개 있더라도 상관없다.

// Upper bound
// 찾고자 하는 값보다 큰 값이 처음으로 나타나는 위치를 반환한다.

// [Lower bound] 와 [Upper bound] 는 이분탐색으로 찾을 데이터가 여러개인 경우 몇개의 데이터가 존재하는지 찾을 때 사용하면 된다.
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
