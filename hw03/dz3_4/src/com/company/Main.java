package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human man1 = new Man("Tom", "Kruz", 170, 70);
        Human man2 = new Man("Bred", "Pitt", 185, 75);
        Human man3 = new Man("Jason", "Statham", 180, 75);

        Human woman1 = new Woman("Angelina", "Jolie", 170, 60);
        Human woman2 = new Woman("Emma", "Stone", 165, 55);
        Human woman3 = new Woman("Julia", "Roberts", 168, 57);

        System.out.println("test how " + man1.getName() + " " + man1.getSurname() + " matches to " + woman1.getName() + " " + woman1.getSurname());
        Human child1 = Human.matchingTest(man1,woman1);

        if (child1 != null) {
            System.out.println(" matched to each other and their child is: " + child1.toString());
        }
        else {
            System.out.println("Won't work, they will break up");
        }


    }
}
