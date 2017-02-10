package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Student list:
      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of students in the list");
        int n = Integer.parseInt(scan.next());*/
        List list1 = new List();
        Student [] students = new Student[6];
        students[0] = new Student(1, "Vasiliev", "Dima", "math", 2, "19890616", "M22");
        students[1] = new Student(1, "Bulakh", "Julia", "design", 1, "19901021", "D11");
        students[2] = new Student(1, "Iarosh", "Alex", "math", 2, "19900810", "M22");
        students[3] = new Student(1, "P4elkina", "Anya", "farm", 3, "19890903", "F33");
        students[4] = new Student(1, "Heor", "Velya", "design", 1, "19910921", "D11");
        students[5] = new Student(1, "Queen", "Oliver", "veterinar", 4, "19880102", "V44");

        /*for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i+1) + " student's name");
            String name = scan.next();
            System.out.println("Enter " + (i+1) + " student's surname");
            String surname = scan.next();
            System.out.println("Enter " + (i+1) + " student's faculty");
            String faculty = scan.next();
            System.out.println("Enter " + (i+1) + " student's group");
            String group = scan.next();
            System.out.println("Enter " + (i+1) + " student's birthday");
            String birthday = scan.next();
            System.out.println("Enter " + (i+1) + " student's grade");
            int grade = Integer.parseInt(scan.next());
            students[i] = new Student((i+1), surname, name, faculty, grade, birthday, group);
        }*/

        list1.setStudents(students);

        list1.showList();
        list1.showFacultyList("math");
        list1.showGroupList("D11");
        list1.showStudentsYongerThan(1989);
        list1.ShowStudentsFromEveryFacultyAndGrade();


    }
}
