package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrayEx {

    // Refactor by method
    // parameter
    public static void printArray(int[][] arr) {      // 2차원 배열을 입력받는다.
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        arr[0][0] = 1;
        arr[1][0] = 2;
        arr[0][2] = 3;

        // 이전에 선언했던 printArray 메소드 사용 가능
        printArray(arr);
    }
}