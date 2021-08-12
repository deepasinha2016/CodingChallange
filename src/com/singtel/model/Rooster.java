package com.singtel.model;

public class Rooster extends Bird{

    public Rooster() {
        super(false,false, true);
    }

    @Override
    public void sing() {
       System.out.println( "Cock-a-doodle-doo");
    }
}
