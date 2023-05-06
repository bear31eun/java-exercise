package com.example.javaproject2.codeup;
import java.util.*;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] SSN= sc.nextLine().split("-");

        for(String i : SSN){
            System.out.printf(i);
        }
    }
}
