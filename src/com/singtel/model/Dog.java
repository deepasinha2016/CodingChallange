package com.singtel.model;

public class Dog extends Animal{

    public Dog(){
        super(true,false);
    }

    @Override
    public String toString() {
        return "Dog:" +super.toString();
    }
}
