package com.example.javaproject2.codeup;
import java.util.*;
public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        String[] data=sc.nextLine().split("\\.");
        System.out.printf("%04d.%02d.%02d",Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2]));
    }
}
