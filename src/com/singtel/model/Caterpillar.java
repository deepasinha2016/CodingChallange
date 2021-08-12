package com.singtel.model;

public class Caterpillar extends  Animal {

    public Caterpillar(){ super(true,false);}

    @Override
    public void walk() {
        System.out.println("I can crawl");
    }
}
