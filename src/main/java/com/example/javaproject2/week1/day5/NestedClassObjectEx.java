package com.example.javaproject2.week1.day5;

public class NestedClassObjectEx {
    public static class User{
        // 이름, 전화번호, 나이
        String name;
        String phoneNumber;
        int age;

        boolean isAdult(){
            return age >= 18;
        }


    }

    public static void main(String[] args) {
        User kyeongrok = new User();
        kyeongrok.name = "김경록";
        kyeongrok.phoneNumber = "010-1234-5678";
        kyeongrok.age = 25;

        User jaesung = new User();
        jaesung.name = "재성 매니저님";
        jaesung.phoneNumber = "010-4321-8765";
        jaesung.age = 17;

        System.out.printf("%s님은 성인입니까? %s\n", kyeongrok.name, kyeongrok.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", jaesung.name, jaesung.isAdult());
    }
}
