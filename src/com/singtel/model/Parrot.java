package com.singtel.model;

public class Parrot extends Bird{
    private String nearByPlace;
    public Parrot() {
        super(false, true,true);
    }

    public Parrot(String place){
        super();
        this.nearByPlace = place;
    }

    @Override
    public void sing() {
        if(nearByPlace.equalsIgnoreCase("HouseWithDogs"))
        System.out.print("Woof,woof");
        else if(nearByPlace.equalsIgnoreCase("HouseWithCats"))
            System.out.print("Me ow");
        else if(nearByPlace.equalsIgnoreCase("FarmNearRooster"))
            System.out.print("Cock-a-doodle-doo");
    }
}
