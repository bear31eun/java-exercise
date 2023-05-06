package com.example.javaproject2.week2.day3;

class ClassInSchool {
    int no;
    Teacher teacher;
    Student[] students; // 배열을 멤버 변수로 사용
}
class Teacher {
    long id;
    String name;
    int age;
    String address;
}
class Student {
    String name;
    String phoneNumber;
    int age;
}

public class ClassInSchoolTest {

    public static void main(String[] args) {

        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "김미미";
        classInSchool.teacher.age = 33;
        classInSchool.teacher.address = "경기도 광주시 양벌동";
        classInSchool.students = new Student[30];

        System.out.println(classInSchool.teacher.name);
        System.out.printf("%d반 담임 선생님 성함은 %s입니다.", classInSchool.no, classInSchool.teacher.name);
    }
}
