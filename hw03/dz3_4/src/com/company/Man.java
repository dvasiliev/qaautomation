package com.company;

/**
 * Created by Dima on 10.02.2017.
 */
public class Man extends Human{

    public Man(String name, String surname, double heigh, double weight) {
        super(true, name, surname, heigh, weight);
    }

    @Override
    public Human bornChild(Human h) {
        System.out.println("Man can't born a child");
        return null;
    }
    @Override
    public String toString() {
        return "Human{" +
                "sex=male"  +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", heigh=" + getHeigh() +
                ", weight=" + getWeight() +
                '}';
    }

}
