package com.bsitask.studentsorting;

import java.util.Comparator;

public class StudentSorting implements Comparator<Student> {
    @Override
    public int compare(Student object1, Student object2) {
        int nameCompare = object1.getName().compareTo(object2.getName());
        if (nameCompare == 0) {
            nameCompare = Integer.compare(object1.getAge(), object2.getAge());
        }
        return nameCompare;
    }
}
