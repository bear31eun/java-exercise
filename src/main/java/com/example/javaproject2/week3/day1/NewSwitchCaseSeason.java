package com.example.javaproject2.week3.day1;
import java.util.*;
public class NewSwitchCaseSeason {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int month=sc.nextInt();
        switch(month){

            case 12,1,2 -> System.out.println("겨울이예요");
            case 3,4,5 -> System.out.println("봄이예요");
            case 6,7,8 -> System.out.println("여름이예요");
            case 9,10,11 -> System.out.println("가을이예요");
            default -> throw new IllegalArgumentException(String.format("%d는 지구날짜가아니예요!",month));


        }


    }



}
