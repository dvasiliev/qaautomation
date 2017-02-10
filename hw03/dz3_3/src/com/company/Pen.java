package com.company;

/**
 * Created by Dima on 08.02.2017.
 */
public class Pen extends Stationery {
    String color;
    String brand;
    static double avgprice = 0;

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + super.getName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Pen(String name, int price, String color, String brand) {

        super(name, price);
        this.color = color;
        this.brand = brand;
    }

    public Pen(String name, int price) {
        super(name, price);
    }

    @Override
    public void clean() {
        System.out.println("Sentence written by Pen can't be cleaning");
    }
}
