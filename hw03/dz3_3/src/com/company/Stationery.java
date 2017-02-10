package com.company;

/**
 * Created by Dima on 08.02.2017.
 */
public abstract class Stationery {
    private String name;
    private int price;
    static double avgprice = 0;
    static double count = 0;

    public Stationery(String name, int price) {
        this.name = name;
        this.price = price;
        avgprice+=price;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void clean();

    static double calcAvgPrice(){
        if (count >0 ) return avgprice/count;
        else return count;
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
