package com.Test;

public class BondJumps {
    public void canBondMakeIt(double velocity, double angle, double gravity) {
        double distance = (velocity*velocity*Math.sin(angle))/gravity;
        System.out.println("Bond will be able to jump "+distance +" meters.");
        if (distance >= 5.0){
            System.out.println("Bond can make it");
        } else {
            System.out.println("Bond cannot make it");
        }
    }

    public static void main(String[] args) {
        BondJumps jump = new BondJumps();
        jump.canBondMakeIt(8, 0.45, 9.81);

    }
}
