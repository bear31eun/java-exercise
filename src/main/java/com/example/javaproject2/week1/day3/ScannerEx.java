package com.example.javaproject2.week1.day3;
import java.util.*;
public class ScannerEx {
    public void plusTwoNumbers(int val1, int val2) {
        System.out.println(val1 + val2);

}

    public void readTwoNumbersAndPlus() {
        // 숫자 2개 입력 받기
        Scanner sc = new Scanner(System.in);
        plusTwoNumbers(sc.nextInt() , sc.nextInt());
    }
}
