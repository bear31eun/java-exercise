package com.example.javaproject2.week2.day3;


class Child{
    String name;
    int age;
}
public class ReferenceTypeArray {
    public static void main(String[] args) {
        Child[] child =new Child[2];
        child[0]=new Child();
        child[0].name="진도준";
        child[0].age=22;
        child[1]=new Child();
        child[1].name="진성준";
        child[1].age=28;
    }
}
