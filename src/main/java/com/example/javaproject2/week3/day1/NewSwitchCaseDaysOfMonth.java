package com.example.javaproject2.week3.day1;
public class NewSwitchCaseDaysOfMonth {
    public static void main(String[] args) {
        int month = 13; // 주어진 변수 month의 타입이 int형 이기때문에 int형으로 타입 추론
        int lastDate = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalArgumentException("해당 월은 없습니다. 입력 월:" + month);
        };

        System.out.printf("%d월은 %d일까지 있습니다.\n", month, lastDate);
    }
}
