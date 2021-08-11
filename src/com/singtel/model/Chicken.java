package com.singtel.model;

public class Chicken extends Bird{

    @Override
    public void sing() {
        System.out.println("Cluck cluck");
    }
    public Chicken(boolean canSwim, boolean canFly){
        super(canSwim,canFly);
    }
}