package com.example.javaproject2.week1.day5;

public class Point {
     int x;
     int y;
    boolean isSameXy() {
        // x와 y가 같니?
        return x == y;
    }
    double getDistance(Point p2) {
        int xL = p2.x - this.x;
        int yL = p2.y - this.y;

        double sumOfPow = Math.pow(xL, 2) + Math.pow(yL, 2);
        double result = Math.sqrt(sumOfPow);

        return result;
    }





}

class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;

        Point p2 = new Point();
        p2.x = 3;
        p2.y = 4;

        System.out.printf("x:%d,y:%d \n", p1.x, p1.y);
        System.out.printf("xy가 같은가? %b \n", p1.isSameXy());
        System.out.printf("두점사이의 거리:%f \n ", p1.getDistance(p2));

    }

}
