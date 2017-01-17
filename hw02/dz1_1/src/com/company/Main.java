package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {

        // Enter from console n integer numbers
        System.out.println("1. ---------------------------------");
        int n = 10;
        int[] num = new int[] {121, 234, 3, 56, 24, 6, 18, 1, 41, 8};;
        System.out.println("Enter " + n +" integer numbers");
        System.out.println(Arrays.toString(num));
     /*   Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(scan.next());
        }

  */      // 1. Find the shortest and the longest number
        System.out.println("---------------------------------");
        int min = num[0];
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (valueOf(num[i]).length() < valueOf(min).length()) {min = num[i];}
            if (valueOf(num[i]).length() > valueOf(max).length()) {max = num[i];}

        }
        System.out.println("Show the shortest number");
        System.out.println("number: " + min + " length of this number is: " + valueOf(min).length());
        System.out.println("Show the longest number");
        System.out.println("number: " + max + " length of this number is: " + valueOf(max).length());

        // 2. Sort and display numbers in ascending order of their length
        System.out.println("2. ---------------------------------");
        int [] num2 = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            num2[i] = num [i];
        }
        System.out.println("Display numbers in ascending order of their length");

        for (int i = 0; i < num2.length-1; i++) {
            int tmp = num2[i];
            int index = i;
            for (int j = i+1; j < num2.length; j++) {
                if (valueOf(num2[j]).length() < valueOf(tmp).length() ) {tmp = num2[j]; index = j;}
            }
            System.arraycopy(num2, i, num2, i+1, index - i);
            num2[i] = tmp;
        }
        System.out.println(Arrays.toString(num2));

        // 3. Display numbers which length are bigger than average
        System.out.println("3. ---------------------------------");
        System.out.println("Display numbers which length are bigger than average");
        int sumlength = 0;
        for (int i = 0; i < num.length; i++) {
            sumlength+=valueOf(num[i]).length();
        }
        double avglength = sumlength *1.0 / num.length;
        System.out.println("Average length = " + avglength);

        for (int i = 0; i < num.length; i++) {
            if (valueOf(num[i]).length() >= avglength) {System.out.println("number " + num[i] + " with length = " + valueOf(num[i]).length());}
        }

        // 4. Display number with the least number of different digits
        System.out.println("4. ---------------------------------");
        int [] difdig = new int[num.length];
        for (int i = 0; i < num.length; i++) {

            int tmpdifdig = 1;
            for (int j = 0; j < valueOf(num[i]).length(); j++) {
                boolean flg = true;
                for (int k = 0; k < j; k++) {
                    if (valueOf(num[i]).charAt(j) == valueOf(num[i]).charAt(k)) {flg = false; break;}
                }
                if (flg == true) {tmpdifdig++;}
            }
            difdig[i] = tmpdifdig;
        }

        int leastdifdignum = difdig[0];
        int leastdifdigindex = 0;
        for (int i = 0; i < num.length; i++) {
            if (difdig[i] < leastdifdignum) {leastdifdignum = difdig[i]; leastdifdigindex = i;}
        }
        System.out.println("Display the first number with least different digits");
        System.out.println(num[leastdifdigindex]);

        // 5. count numbers with only even digits
        System.out.println("5. ---------------------------------");
        int countevendignum = 0;
        for (int i = 0; i < num.length; i++) {
            boolean flg = true;
            for (int j = 0; j < valueOf(num[i]).length(); j++) {
                if (Integer.parseInt(String.valueOf(valueOf(num[i]).charAt(j))) % 2 == 1 ) {flg = false; break;}
            }
            if (flg) {countevendignum++;}
        }
        System.out.println("Amount of numbers with only even digits are: " + countevendignum);

        int countevenodddig = 0;
        for (int i = 0; i < num.length; i++) {
            int countevendig = 0;
            int countodddig = 0;
            for (int j = 0; j < valueOf(num[i]).length(); j++) {
                if (Integer.parseInt(String.valueOf(valueOf(num[i]).charAt(j))) % 2 == 0 ) {countevendig++;}
                else {countodddig++;}
            }
            if (countevendig == countodddig) {countevenodddig++;}
        }
        System.out.println("Amount of numbers with equal even and odd digits are: " + countevenodddig);

        // 6. Find first number which have ascending sorted digits
        System.out.println("6. ---------------------------------");

        int index6 = -1;
        for (int i = 0; i < num.length; i++) {
            boolean flg = true;
            for (int j = 0; j < valueOf(num[i]).length()-1; j++) {
                if (Integer.parseInt(String.valueOf(valueOf(num[i]).charAt(j+1))) < Integer.parseInt(String.valueOf(valueOf(num[i]).charAt(j)))) {flg = false; break;}
            }
            if (flg) {index6 = i; break;}
        }
        if (index6 == -1) {System.out.println("There is no number which have ascending sorted digits");}
        else {System.out.println("The first number which have ascending sorted digits is " + num[index6]);}

        // 7. Find first number which contains only from different digits
        System.out.println("---------------------------------");

        int index7 = -1;
        for (int i = 0; i < num.length; i++) {

            int tmpdifdig = 0;
            for (int j = 0; j < valueOf(num[i]).length(); j++) {
                boolean flg = true;
                for (int k = 0; k < j; k++) {
                    if (valueOf(num[i]).charAt(j) == valueOf(num[i]).charAt(k)) {flg = false; break;}
                }
                if (flg) {tmpdifdig++;}
            }
            if (tmpdifdig == valueOf(num[i]).length()) {index7 = i; break;}
        }
        if (index7 == -1) {System.out.println("There is no number which contain only from different digits");}
        else {System.out.println("The first number which contains only from different digits is " + num[index7]);}



    }
}
