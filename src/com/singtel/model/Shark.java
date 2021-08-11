package com.singtel.model;

public class Shark extends Fish {

    public Shark(){
       super("Grey","Large");
    }


    public void eat(){
        System.out.println("I eat other fish");
    }

    @Override
    public String toString() {
        return "Shark:" + super.toString();
    }
}
