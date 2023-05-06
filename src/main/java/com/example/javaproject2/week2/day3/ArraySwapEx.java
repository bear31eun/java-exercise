package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class ArraySwapEx {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 7, 6};
        System.out.println("변경 전: " + Arrays.toString(arr));
        // 변경 전: [2, 1, 4, 8, 7, 6]
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println("변경 후: " + Arrays.toString(arr));
        // 변경 후: [1, 2, 4, 8, 7, 6]

        // 오름차순 정렬
        // Arrays 클래스의 sort() 메소드
        Arrays.sort(arr);
        System.out.println("오름차순 정렬 후: " + Arrays.toString(arr));
        // 오름차순 정렬 후: [1, 2, 4, 6, 7, 8]
    }
}