package com.singtel.model;

public class ClownFish  extends  Fish{

    public ClownFish(){
        super("Orange","Small");
    }

    public void joke(){
        System.out.println("I joke");
    }

    @Override
    public String toString() {
        return "ClownFish:" + super.toString();
    }
}
