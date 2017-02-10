package com.company;

public class Main {

    public static void main(String[] args) {

        ElectricalAppliances [] appliances = new ElectricalAppliances[8];

        appliances[0] = new KitchenElectrAppliances(20, "Kettle");
        appliances[1] = new KitchenElectrAppliances(80, "Fridge");
        appliances[2] = new KitchenElectrAppliances(60, "Stove");

        appliances[3] = new HousholdElectrAppliances(60, "Vacuum Cleaner");
        appliances[4] = new HousholdElectrAppliances(40, "Iron");

        appliances[5] = new TvAndOtherEntertaimentApp(23, "TV");
        appliances[6] = new TvAndOtherEntertaimentApp(30, "Computer");
        appliances[7] = new TvAndOtherEntertaimentApp(10, "Radio");

        appliances[0].switchOn();
        appliances[1].switchOn();
        appliances[3].switchOn();
        appliances[5].switchOn();

        int totalpower = 0;
        for (int i = 0; i < appliances.length; i++) {
            totalpower+=appliances[i].getCurrentstatepower();
        }
        System.out.println("Total using Power currently = " + totalpower + " watt");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < appliances.length; i++) {
            for (int j = i; j < appliances.length; j++) {
                if (appliances[j].getPower() < appliances[i].getPower()){
                    ElectricalAppliances e = appliances[i];
                    appliances[i] = appliances[j];
                    appliances[j] = e;
                }
            }
        }

        for (int i = 0; i < appliances.length; i++) {
            System.out.println(appliances[i].toString());
            System.out.println();
        }

        System.out.println("--------------------------------------------");

        int loweredge = 20;
        int higheredge = 50;
        int onoff = 1;
        int count = 0;

        for (int i = 0; i < appliances.length; i++) {
            if(appliances[i].getPower()>=loweredge
                    && appliances[i].getPower() <= higheredge
                    && appliances[i].getFlg() == onoff) {
                System.out.println("This electracal appliances suited to our request: " + appliances[i].toString());
                System.out.println();
                count++;
            }
        }
        if (count == 0) System.out.println("There was no electracal appliances suited to our request");



    }
}
