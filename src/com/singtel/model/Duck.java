package com.singtel.model;

public class Duck extends Bird{

    public Duck(boolean canSwim, boolean canFly){
        super(canSwim,canFly);
    }
    @Override
    public void sing() {
        System.out.println("Quack quack");
    }
}
