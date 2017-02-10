package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class List {
    private Student [] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void showList () {
        System.out.println("Show list of all students");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        System.out.println("-----------------------------------");
    }

    public void showFacultyList (String faculty) {
        System.out.println("Show list of students from faculty: " + faculty);
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty() == faculty) {System.out.println(students[i].toString());}
        }
        System.out.println("-----------------------------------");
    }

    public void showGroupList (String group) {
        System.out.println("Show list of students from group: " + group);
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup() == group) {System.out.println(students[i].toString());}
        }
        System.out.println("-----------------------------------");

    }

    public void showStudentsYongerThan (int year) {
        System.out.println("Show list of students that born after " + year + " year");
        for (int i = 0; i < students.length; i++) {
            if (year < Integer.parseInt((students[i].getBirthday()).substring(0,4))) System.out.println(students[i].toString());
        }
        System.out.println("-----------------------------------");
    }

    public void ShowStudentsFromEveryFacultyAndGrade () {
        String [] faculties = new String[students.length];
        faculties[0] = students[0].getFaculty();
        int count = 0;
        for (int i = 1; i < students.length; i++) {
            boolean flg = true;
            for (int j = 0; j < i-1; j++) {
                if (students[i].getFaculty() == students[j].getFaculty()) {flg = false; break;}
            }
            if (flg == true) {count++; faculties[count] = students[i].getFaculty();}
        }
/*        int count2 = 0;
        for (int i = 0; i < faculties0.length; i++) {
            if (faculties0[i] != null) count2++;
            else break;
        }*/
        System.out.println(Arrays.toString(faculties));

        int i = 0;
        while (faculties[i] != null) {
            for (int j = 1; j <= 6; j++) {
                int count2 = 0;
                for (Student s: students) {
                    if (s.getFaculty() == faculties[i] && s.getGrade() == j) {count2++; }
                }
                if (count2 == 0) {continue;}
                else {
                    System.out.println("Show list of students from " + faculties[i] + " faculty and from " + j + " grade");
                    for (Student s : students) {
                        if (s.getFaculty() == faculties[i] && s.getGrade() == j) {
                            System.out.println(s.toString());
                        }
                    }
                }
            }
            i++;
        }


    }


    @Override
    public String toString() {
        return "number of students in this list = " + students.length;
    }
}
