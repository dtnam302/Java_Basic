package com.W4;

public class Saturn extends Planet{

    public Saturn() {
        super("Saturn", 6, "Cold");
    }


    public String getFact(){

        return  super.getFact() + ". Saturn has massive rings."; //super = object Planet
    }
}
