package com.singtel.model;

public class Bird  extends Animal implements IMotion{

    private boolean canSwim, canFly, canSing;

    public Bird(boolean canSwim, boolean canFly, boolean canSing) {
        super();
        this.canSwim = canSwim;
        this.canFly = canFly;
        this.canSing = canSing;
    }


    public Bird() {

    }

    public void swim(){
            System.out.println("I am swimming");

    }



    public void sing() {
        System.out.println("I am singing");
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    @Override
    public boolean isCanFly() {
        return canFly;
    }

    public boolean isCanSing() {
        return canSing;
    }
}
