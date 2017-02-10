package com.company;

/**
 * Created by Dima on 10.02.2017.
 */
public class KitchenElectrAppliances extends ElectricalAppliances {

    private String name;

    public String getName() {
        return name;
    }

    public KitchenElectrAppliances(int power, String name) {
        super(power);
        this.name = name;
    }

    public KitchenElectrAppliances(int power) {
        super(power);
    }

    @Override
    public void applianceAction() {
        System.out.println("This electrical appliance is made for cooking");
    }

    @Override
    public String toString() {
        return "KitchenElectrAppliances{" +
                "name='" + name +
                ", power=" + getPower() +
                " watt, currentstatepower=" + getCurrentstatepower() +
                " watt, onoff='" + getOnoff() +'\'' +
                '}';
    }
}
