package com.company;

import java.util.Random;

import static java.lang.Math.min;
import static java.lang.Math.random;

/**
 * Created by Dima on 10.02.2017.
 */
public abstract class Human implements HumanBehaviour{
    private boolean sex;
    private String name;
    private String surname;
    private double heigh;
    private double weight;

    public Human() {
    }

    public Human(boolean sex, String name, String surname, double heigh, double weight) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.heigh = heigh;
        this.weight = weight;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getHeigh() {
        return heigh;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeigh(float heigh) {
        this.heigh = heigh;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public boolean canSpeak(Human h) {
        if (isSex() == false && h.isSex() == false) {return true;}
        if (isSex() == false && h.isSex() == true) {return true;}
        if (isSex() == true && h.isSex() == false) {return true;}
        else {
            double flg = random();
            if (flg<=0.5) return true;
            else return false;
            }
    }

    @Override
    public boolean hasToleranceTo(Human h) {
        double flg = random();
        if (isSex() == false && h.isSex() == false) {
            if (flg <= 0.05) return true;
            else return false;}
        if (isSex() == false && h.isSex() == true) {
            if (flg <= 0.7) return true;
            else return false;}
        if (isSex() == true && h.isSex() == false) {
            if (flg <= 0.7) return true;
            else return false;}
        else {
            if (flg<=0.056) return true;
            else return false;
        }
    }


    @Override
    public boolean spendTimeWith(Human h) {
        double flg = random();
        double heighdifinperc = Math.abs(getHeigh()-h.getHeigh())/min(getHeigh(),h.getHeigh());
        if (heighdifinperc > 0.1) {
            if (flg <=0.85) return true;
            else return false;
        }
        else {
            if (flg <=0.95) return true;
            else return false;
        }
    }

    @Override
    public Human goOutWith(Human h) {
        boolean flg1 = canSpeak(h);
        boolean flg2 = hasToleranceTo(h);
        boolean flg3 = spendTimeWith(h);
        if (flg1 && flg2 && flg3 && isSex()!=h.isSex()) {
            if (isSex() == false) {return bornChild(h);}
            else return h.bornChild(this);
            }
        else {
            return null;
            }
    }

    public static Human matchingTest(Human h1, Human h2){
        return h1.goOutWith(h2);
    }

    @Override
    public String toString() {
        return "Human{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", heigh=" + heigh +
                ", weight=" + weight +
                '}';
    }

    public abstract Human bornChild(Human h);
}
