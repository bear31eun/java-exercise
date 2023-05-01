package com.example.javaproject2.week1.day4;
import java.util.*;
public class AverageCalculator {
    void Calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        String num=scanner.nextLine();
        String[] numbers=num.split(" ");

        int sum =0;

        for(String i :numbers){
            sum += Integer.parseInt(i);

        }

        System.out.println(String.format("평균값은 %d",(sum/ numbers.length)));





    }
}
