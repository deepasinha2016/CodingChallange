package com.singtel.model;

public class Chicken extends Bird{

    @Override
    public String sing() {
         return "Cluck, cluck";
    }
    public Chicken(){
        super(false,false,true);

    }
}