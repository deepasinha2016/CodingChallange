package com.singtel.model;

public class Animal implements IMotion{

    private boolean canWalk, canFly;

    public Animal(){

    }

    public Animal(boolean canWalk, boolean canFly) {
        super();
        this.canWalk = canWalk;
        this.canFly = canFly;
    }


    public boolean isCanWalk() {
        return canWalk;
    }

    public boolean isCanFly() {
        return canFly;
    }
}
