package org.example.Head02_OOP.example02;

public class OOPGrandManager {
    public static void main(String[] args) {
        Student[] students = {
                new Student("경은", 90, 95),
                new Student("성준", 90, 79),
        };
        for (Student student : students) {
            System.out.printf("%s 평균: %.1f\n", student.name, student.getAverage());
        }
    }
}
