package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //6 task: Enter from console n integer numbers
        System.out.println("---------------------------------");
        int n = 10;
        int[] num = new int[n];
        System.out.println("Enter " + n +" integer numbers");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(scan.next());
        }

        // a: Display odd and even numbers
        System.out.println("---------------------------------");
        System.out.println("Display all odd numbers");
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] % 2 == 1) {System.out.print(num[i] + " "); x++;}
        }
        if (x == 0) System.out.println("There is no odd numbers");
        System.out.println();
        x = 0;
        System.out.println("Display all even numbers");
        for (int i = 0; i < n; i++) {
            if (num[i] % 2 == 0) {System.out.print(num[i] + " "); x++;}
        }
        if (x == 0) System.out.println("There is no even numbers");
        System.out.println();

        // b: show max and min
        System.out.println("---------------------------------");
        int max = num[0];
        int min = num[0];
        for (int i = 0; i < n; i++) {
            if (num[i]>max) {max = num[i];}
            if (num[i]<min) {min = num[i];}
        }
        System.out.println("Min number is " + min);
        System.out.println("Max number is " + max);

        // c: show number which divided by 3 or 9
        System.out.println("---------------------------------");
        System.out.println("show number which divided by 3 or 9");
        x = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] % 3 == 0) {System.out.print(num[i] + " "); x++;}
        }
        if (x == 0) System.out.println("There is no numbers which divided by 3 or 9");
        System.out.println();

        // d: show number which divided by 5 and 7
        System.out.println("---------------------------------");
        System.out.println("show number which divided by 5 and 7");
        x = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] % 5 == 0 && num[i] % 7 == 0) {System.out.print(num[i] + " "); x++;}
        }
        if (x == 0) System.out.println("There is no numbers which divided by 5 and 7");
        System.out.println();

        // e: 3 digits numbers with all different digits
        System.out.println("---------------------------------");
        System.out.println("show 3 digits numbers with all different digits");
        x = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] > 99 && num[i] < 1000) {
                int a = num[i]/100;
                int b = (num[i]%100)/10;
                int c = num[i]%10;
                if (a != b && a != c && b != c)
                {System.out.print(num[i] + " "); x++;}
            }
        }
        if (x == 0) System.out.println("There is no 3 digits numbers with all different digits");
        System.out.println();
        // f: show all happy numbers
        System.out.println("---------------------------------");
        System.out.println("show all happy numbers");
        x = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] > 99999 && num[i] < 1000000) {
                int a1 = num[i]/100000;
                int a2 = (num[i]%100000)/10000;
                int a3 = (num[i]%10000)/1000;
                int a4 = (num[i]%1000)/100;
                int a5 = (num[i]%100)/10;
                int a6 = num[i]%10;
                if (a1+a2+a3 == a4+a5+a6) {System.out.print(num[i] + " "); x++;}
            }
        }
        if (x == 0) System.out.println("There is no happy numbers");
        System.out.println();
        // g: show numbers which are average of of adjacent numbers
        System.out.println("---------------------------------");
        System.out.println("show numbers which are average of adjacent numbers");
        x = 0;
        for (int i = 1; i < n-1; i++) {
            if (num[i] == (num[i-1] + num[i+1])/2 && (num[i-1] + num[i+1])%2 == 0)
            {System.out.print(num[i] + " "); x++;}
        }
        if (x == 0) System.out.println("There is no such numbers");

        scan.close();
    }
}
