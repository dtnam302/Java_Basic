package com.W4;

public class FalconTen extends Rocket{

    public FalconTen(String nameRocket) {
        super(nameRocket);
        super.numStages = 2;
    }

    public void fly() {
        System.out.println("Starting flight for: " + super.getName());
        System.out.println("After 50 seconds, stage 1 separates");
        System.out.println("After 75 seconds, stage 2 separates");
        System.out.println("We're in space!");

    }

    public static void main(String[] args) {
        Rocket toTheMoon = new FalconTen("To the Moon!");
        toTheMoon.fly();

    }
}
