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
    public String sing() {
        if(nearByPlace.equalsIgnoreCase("HouseWithDogs"))
        return "Woof, woof";
        else if(nearByPlace.equalsIgnoreCase("HouseWithCats"))
            return "Me ow";
        else if(nearByPlace.equalsIgnoreCase("FarmNearRooster"))
            return "Cock-a-doodle-doo";
        else
            return "I am singing";
    }
}
