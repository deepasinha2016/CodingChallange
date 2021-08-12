package com.singtel.model;

public class Duck extends Bird{


    public Duck(){

        super(true,false,true);
    }


    @Override
    public void sing() {
        System.out.println("Quack quack");
    }
}
