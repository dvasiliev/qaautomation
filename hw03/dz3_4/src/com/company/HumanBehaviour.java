package com.company;

/**
 * Created by Dima on 11.02.2017.
 */
public interface HumanBehaviour {
    public abstract boolean canSpeak(Human h);
    public abstract boolean hasToleranceTo(Human h);
    public abstract boolean spendTimeWith(Human h);
    public abstract Human goOutWith(Human h);
    public abstract Human bornChild(Human h);
}
