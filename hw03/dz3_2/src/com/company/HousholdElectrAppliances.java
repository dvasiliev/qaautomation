package com.company;

/**
 * Created by Dima on 10.02.2017.
 */
public class HousholdElectrAppliances extends ElectricalAppliances {
    private String name;

    public HousholdElectrAppliances(int power, String name) {
        super(power);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HousholdElectrAppliances(int power) {
        super(power);
    }

    @Override
    public void applianceAction() {
        System.out.println("This electrical appliance is made for household job");
    }

    @Override
    public String toString() {
        return "HousholdElectrAppliances{" +
                "name='" + name +
                ", power=" + getPower() +
                " watt, currentstatepower=" + getCurrentstatepower() +
                " watt, onoff='" + getOnoff() +'\'' +
                '}';
    }
}
