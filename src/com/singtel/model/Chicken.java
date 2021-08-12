package com.singtel.model;

public class Chicken extends Bird{

    @Override
    public void sing() {
        System.out.println("Cluck cluck");
    }
    public Chicken(){
        super(false,false,true);

    }
}