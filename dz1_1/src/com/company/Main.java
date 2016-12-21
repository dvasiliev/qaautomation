package com.company;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1 task: say Hello to anyone who write his name in console
        System.out.println("---------------------------------");
        System.out.println("Write your name and press enter");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hi, " + name);


        //2 task: Show in console arguments inversed
        System.out.println("---------------------------------");
        String tmp;
        for (int i = 0; i<args.length/2; i++) {
            tmp = args[i];
            args[i] = args[args.length - 1 - i];
            args[args.length - 1 - i] = tmp;
        }
        System.out.println("Show arguments inversed");
        System.out.println(Arrays.toString(args));

        //3 task: Display given number of random numbers with and without newline
        System.out.println("---------------------------------");
        System.out.println("Write number of random numbers you want to display");
        int number = scan.nextInt();
        Random rand = new Random();
        for (int i = 0; i < number/2; i++) {
            System.out.print(rand.nextInt(100) + " ");
        }
        for (int i = number/2; i < number; i++) {
            System.out.println(rand.nextInt(100));
        }


        // 4 task: Enter password from command line and compare it with default password
        System.out.println("---------------------------------");
        String pass_default = "password";
        System.out.println("Write your password");
        String pass = scan.next();
        if (pass.equals(pass_default)) {System.out.println("Your password is the same as default");}
        else {System.out.println("Your password is not the same as default");}


        // task 5: Calculate sum, multiplication, and display results
        System.out.println("---------------------------------");
        int sum = 0;
        int multiply = 1;
        for (int i = 0; i < args.length; i++) {
            sum+=Integer.parseInt(args[i]);
            multiply*=Integer.parseInt(args[i]);
        }
        System.out.println("Sum of arguments = " + sum);
        System.out.println("Multiplication of arguments = " + multiply);

        // task 6: Calculate sum, multiplication, and display results
        System.out.println("---------------------------------");

        scan.close();
    }
}
