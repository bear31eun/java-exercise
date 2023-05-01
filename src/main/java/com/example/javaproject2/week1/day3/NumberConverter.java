package com.example.javaproject2.week1.day3;
import java.io.*;
public class NumberConverter {

    public void plusTwoNumbers() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); // 카트 가지고 오기
        System.out.println(Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()));
    }
}
