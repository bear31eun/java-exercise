package com.example.javaproject2.week1.day5;

public class UserobjectExTest {
    public static void main(String[] args) {


        UserObjectEx kyeongrok = new UserObjectEx();
        kyeongrok.name = "김경록";
        kyeongrok.phoneNumber = "010-1234-5678";
        kyeongrok.age = 25;


        UserObjectEx jaesung = new UserObjectEx();
        jaesung.name = "재성 매니저님";
        jaesung.phoneNumber = "010-4321-8765";
        jaesung.age = 17;

        System.out.printf("%s님은 성인입니까? %s\n", kyeongrok.name, kyeongrok.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", jaesung.name, jaesung.isAdult());


    }
}
