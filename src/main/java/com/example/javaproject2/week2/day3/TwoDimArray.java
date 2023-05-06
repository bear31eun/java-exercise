package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArray {

    public static void main(String[] args) {

        int[][] arr = new int[3][3]; // 배열 안의 값은 0으로 초기화
        int[] arr0 = arr[0]; // 2차원 배열의 첫 번째 1차원 배열을 변수 arr0에 대입

        arr0[0] = 1; // 1차원 배열 arr0에서 첫 번째 값에 1을 대입

        System.out.println(Arrays.toString(arr[0])); // {1, 0, 0}
        System.out.println(Arrays.toString(arr[1])); // {0, 0, 0}
        System.out.println(Arrays.toString(arr[2])); // {0, 0, 0}

    }

}