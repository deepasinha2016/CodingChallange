package com.singtel.model;

public class Bird   implements IMotion{

    private boolean canSwim, canFly, canSing;

    public Bird(boolean canSwim, boolean canFly, boolean canSing) {
        super();
        this.canSwim = canSwim;
        this.canFly = canFly;
        this.canSing = canSing;
    }


    public Bird() {
        this.canFly = true;
        this.canSing = true;

    }

    public void swim(){
            System.out.println("I am swimming");

    }



    public String sing() {
        return "I am singing";
    }

    public boolean isCanSwim() {
        return canSwim;
    }


    public boolean isCanFly() {
        return canFly;
    }

    public boolean isCanSing() {
        return canSing;
    }
}
