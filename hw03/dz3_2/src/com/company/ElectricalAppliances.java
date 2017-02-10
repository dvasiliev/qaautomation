package com.company;

/**
 * Created by Dima on 10.02.2017.
 */
public abstract class ElectricalAppliances {
    private int power;
    private int currentstatepower;
    private String onoff;
    private int flg;

    public ElectricalAppliances(int power) {
        this.power = power;
        this.currentstatepower = 0;
        this.onoff = "Switched Off";
    }

    public String getOnoff() {
        return onoff;
    }

    public int getFlg() {
        return flg;
    }

    private void setFlg(int flg) {
        this.flg = flg;
    }

    private void setOnoff(String onoff) {
        this.onoff = onoff;
    }

    public int getPower() {
        return power;
    }

    public int getCurrentstatepower() {
        return currentstatepower;
    }

    private void setCurrentstatepower(int currentstatepower) {
        this.currentstatepower = currentstatepower;
    }

    public void switchOn () {
        setCurrentstatepower(getPower());
        setOnoff("Switched On");
        setFlg(1);
    }

    public void switchOff () {
        setCurrentstatepower(0);
        setOnoff("Switched Off");
        setFlg(0);
    }

    public abstract void applianceAction();

}
