package com.singtel.model;

public class ClownFish  extends  Fish{

    public ClownFish(){
        super("Orange","Small");
    }

    public boolean joke(){
        System.out.println("I joke");
        return true;
    }

    @Override
    public String toString() {
        return "ClownFish:" + super.toString();
    }
}
