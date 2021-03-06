package com.W3;

public class StarmanFixes {
    //
    private double oneTurn;
    private double tightenAmount;

    public void setOneTurn(double amout){
        oneTurn = amout;
    }

    public double getTightenAmount(){
        return tightenAmount;
    }
    public void tightenQuarter(){
        tightenAmount += 0.25*oneTurn;
        System.out.println("Starman tightens the nut one quarter of a turn");
    }
    public void tightenHalf(){
        tightenQuarter(); // 0.5
        tightenQuarter(); // 0.5 + 1*0.25 = 0.75
        System.out.println("The nut has been tightened half a turn");
    }
    public void tightenFull(){
        tightenHalf();
        tightenHalf();
        System.out.println("The nut has been tightened a full turn");
    }

    public static void main(String[] args) {
        StarmanFixes wheelnut = new StarmanFixes();

        wheelnut.setOneTurn(1);
        wheelnut.tightenQuarter();
        wheelnut.tightenHalf();
        wheelnut.tightenFull();
        System.out.println(wheelnut.getTightenAmount());
    }
}
