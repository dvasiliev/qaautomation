package com.company;

/**
 * Created by Dima on 10.02.2017.
 */
public class TvAndOtherEntertaimentApp extends ElectricalAppliances {


    private String name;

    public TvAndOtherEntertaimentApp(int power, String name) {
        super(power);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public TvAndOtherEntertaimentApp(int power) {
        super(power);
    }

    @Override
    public void applianceAction() {
        System.out.println("This electrical appliance is made for Entertaiments, watching video, tv, listen music");
    }

    @Override
    public String toString() {
        return "TvAndOtherEntertaimentApp{" +
                "name='" + name +
                ", power=" + getPower() +
                " watt, currentstatepower=" + getCurrentstatepower() +
                " watt, onoff='" + getOnoff() +'\'' +
                '}';
    }
}
