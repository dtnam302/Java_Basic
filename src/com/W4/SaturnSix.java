package com.W4;

public class SaturnSix extends Rocket{
    public SaturnSix(String nameRocket) {
        super(nameRocket);
        super.numStages = 3;
    }

    public void fly() {
        System.out.println("Starting flight for: " + super.getName());
        System.out.println("After 50 seconds, stage 1 separates");
        System.out.println("After 150 seconds, stage 2 separates");
        System.out.println("After 350 seconds, stage 3 separates");
        System.out.println("We're in space!");

    }

    public static void main(String[] args) {
        Rocket toTheMoon = new SaturnSix("To the Moon!");
        toTheMoon.fly();

    }
}
