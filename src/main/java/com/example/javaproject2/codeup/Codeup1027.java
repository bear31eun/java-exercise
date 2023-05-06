package com.example.javaproject2.codeup;
import java.util.*;
public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] date = sc.nextLine().split("\\.");

        for(int i = date.length; i>0;i--){
            System.out.print(date[i-1]);
            if(i!=1){
                System.out.printf("-");
            }
        }

    }
}
