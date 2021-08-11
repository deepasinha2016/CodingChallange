package com.singtel.model;

public class Bird  extends Animal{

    private boolean canSwim, canFly;

    public Bird(boolean canSwim, boolean canFly) {
        super();
        this.canSwim = canSwim;
        this.canFly = canFly;
    }

    public Bird() {

    }

    public void fly(){
        if(canFly)
        System.out.println("I am flying");
        else
            System.out.println("I cannot fly");
    }

    public void swim(){
        if(canSwim)
            System.out.println("I am swimming");
        else
            System.out.println("I cannot swim");
    }

    @Override
    public void walk() {
        super.walk();
    }

    public void sing() {
        System.out.println("I am singing");
    }

}
