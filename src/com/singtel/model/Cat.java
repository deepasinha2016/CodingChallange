package com.singtel.model;

public class Cat extends Animal{
    public Cat(){
        super(true,false);
    }

    @Override
    public String toString() {
        return "Cat:" +super.toString();
    }
}
