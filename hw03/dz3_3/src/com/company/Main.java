package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StationeryShop shop1 = new StationeryShop();
        Stationery [] stationeries = new Stationery[4];
        stationeries[0] = new Pen("applepen", 100, "white", "Apple");
        stationeries[1] = new Pen("pen", 11, "blue", "common");
        stationeries[2] = new Pencil("flomaster", 13, "green", "mars");
        stationeries[3] = new Pencil("pencil", 10, "yellow", "mars");
        shop1.setStationeriy(stationeries);
        shop1.showProducts();
        System.out.println("---------------------------------------------------");
        Stationery st = new Pencil("fear",34,"black","marbel");
        shop1.addProduct(st);
        shop1.productPriceSort();
        shop1.showProducts();
        System.out.println("---------------------------------------------------");
        System.out.println(Stationery.calcAvgPrice());

    }
}
