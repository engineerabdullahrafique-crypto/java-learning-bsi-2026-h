package com.bsitask.studentsorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Ab", 22));
        students.add(new Student(2, "IK", 24));
        students.add(new Student(3, "Ab", 21));
        for (Student stdList : students) {
            System.out.println(stdList);
        }
        System.out.println("\nAfter Sorting");
        students.sort(new StudentSorting());
        for (Student stdList : students) {
            System.out.println(stdList);
        }
    }
}
