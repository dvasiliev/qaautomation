package com.company;

import java.util.Scanner;

import static java.lang.Math.random;

/**
 * Created by Dima on 10.02.2017.
 */
public class Woman extends Human{

    public Woman(String name, String surname, double heigh, double weight) {
        super(false, name, surname, heigh, weight);
    }

    public Human bornChild(Human h){
        double flg = random();
        System.out.println("Name your child");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        Human child;
        if (flg <= 0.5) {
            child = new Man(name, h.getSurname(), (h.getHeigh() + 0.1*(getHeigh()-h.getHeigh())), (h.getWeight() + 0.1*(getWeight()-h.getWeight())) );
            System.out.println("child was born: " + child.toString());
            return child;
            }
        else  {
            child = new Woman(name, h.getSurname(), (getHeigh() + 0.1*(h.getHeigh()-getHeigh())), (getWeight() + 0.1*(h.getWeight()-getWeight())));
            System.out.println("child was born: " + child.toString());
            return child;
            }
    }
    @Override
    public String toString() {
        return "Human{" +
                "sex=female" +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", heigh=" + getHeigh() +
                ", weight=" + getWeight() +
                '}';
    }
}
