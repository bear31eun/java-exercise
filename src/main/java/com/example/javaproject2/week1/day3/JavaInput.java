package com.example.javaproject2.week1.day3;
import java.io.*;
public class JavaInput {
    public void readTwoChars() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();



        System.out.println(asciiCode1);
        System.out.println(asciiCode2);
    }

}
