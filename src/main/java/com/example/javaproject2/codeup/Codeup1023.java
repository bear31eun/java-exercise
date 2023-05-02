package com.example.javaproject2.codeup;
import java.util.*;
public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        String[] words =str.split("\\.");

        for(String i : words){
            System.out.println(i);
        }


    }
}
