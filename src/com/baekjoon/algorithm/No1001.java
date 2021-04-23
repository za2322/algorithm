package com.baekjoon.algorithm;

import java.util.Scanner;

// A-B 출력하기
public class No1001 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println(num1 - num2);
    }
}
