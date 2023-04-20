package com.example.javaproject2.week1.day4;

import java.util.*;

public class MultiplicationTable {
    void Gugudan() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("%d단\n", n);
        for (int j = 1; j <= 9; j++) {
            System.out.printf("%d * %d = %2d\n", n, j, n * j);
        }
        System.out.println();
    }
}