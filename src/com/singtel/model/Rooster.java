package com.singtel.model;

public class Rooster extends Bird{

    public Rooster(boolean canSwim, boolean canFly) {
        super(canSwim, canFly);
    }

    @Override
    public void sing() {
       System.out.println( "Cock-a-doodle-doo");
    }
}
