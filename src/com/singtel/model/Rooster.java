package com.singtel.model;

public class Rooster extends Bird{

    public Rooster() {
        super(false,false, true);
    }

    @Override
    public String sing() {
      return "Cock-a-doodle-doo";
    }
}
