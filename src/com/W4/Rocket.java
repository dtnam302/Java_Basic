package com.W4;

public abstract class Rocket {
    protected String name;
    protected int numStages;

    public Rocket(String nameRocket, int numStagesRocket) {
        name = nameRocket;
        numStages = numStagesRocket;
    }

    public Rocket(String nameRocket) {
        name = nameRocket;
    }

    public abstract void fly();

    public String getName(){
        return name;
    }
}
